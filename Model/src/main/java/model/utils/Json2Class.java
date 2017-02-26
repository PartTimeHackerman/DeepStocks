package model.utils;

import com.sun.codemodel.JCodeModel;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;
import org.jsoup.Jsoup;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Json2Class {
	
	public static List<String> dirs = new ArrayList<>(Arrays.asList(
			"active_symbols",
			"api_token",
			"app_delete",
			"app_get",
			"app_list",
			"app_register",
			"app_update",
			"asset_index",
			"authorize",
			"balance",
			"buy",
			"buy_contract_for_multiple_accounts",
			"cashier",
			"cashier_password",
			"change_password",
			"connect_add",
			"connect_del",
			"connect_list",
			"contracts_for",
			"copy_start",
			"copy_stop",
			"copytrading_statistics",
			"forget",
			"forget_all",
			"get_account_status",
			"get_corporate_actions",
			"get_financial_assessment",
			"get_limits",
			"get_self_exclusion",
			"get_settings",
			"jp_knowledge_test",
			"landing_company",
			"landing_company_details",
			"login_history",
			"logout",
			"mt5_deposit",
			"mt5_get_settings",
			"mt5_login_list",
			"mt5_new_account",
			"mt5_password_change",
			"mt5_password_check",
			"mt5_set_settings",
			"mt5_withdrawal",
			"new_account_japan",
			"new_account_maltainvest",
			"new_account_real",
			"new_account_virtual",
			"new_sub_account",
			"oauth_apps",
			"paymentagent_list",
			"paymentagent_transfer",
			"paymentagent_withdraw",
			"payout_currencies",
			"ping",
			"portfolio",
			"profit_table",
			"proposal",
			"proposal_array",
			"proposal_open_contract",
			"reality_check",
			"reset_password",
			"residence_list",
			"sell",
			"sell_expired",
			"set_account_currency",
			"set_financial_assessment",
			"set_self_exclusion",
			"set_settings",
			"statement",
			"states_list",
			"ticks",
			"ticks_history",
			"time",
			"tnc_approval",
			"topup_virtual",
			"trading_times",
			"transaction",
			"transfer_between_accounts",
			"verify_email" ,
			"website_status"));
	
	public static void main(String[] args) {
		JCodeModel codeModel = new JCodeModel();
		
		GenerationConfig config = new DefaultGenerationConfig() {
			@Override
			public AnnotationStyle getAnnotationStyle() {
				return AnnotationStyle.GSON;
			}
			
			@Override
			public boolean isIncludeConstructors() {
				return true;
			}
			
			@Override
			public boolean isSerializable() {
				return true;
			}
		};
		
		SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new GsonAnnotator(config), new SchemaStore()), new SchemaGenerator());
		
		for (String dir : dirs) {
			getClass(dir, codeModel, mapper);
			System.out.println(dirs.indexOf(dir)+"/"+dirs.size());
		}
		
	}
	
	public static void getClass(String dir, JCodeModel codeModel, SchemaMapper mapper) {
		String json;
		String url = "https://raw.githubusercontent.com/binary-com/websockets/gh-pages/config/v3/";
		
		
		File file = new File("class");
		mkFile(file);
		
		try {
			json = Jsoup.connect(url + dir + "/" + "send.json").get().text();
			mapper.generate(codeModel, getWithoutFloor(dir) + "Send", "binaryAPI.commands."+dir, json);
			codeModel.build(file);
			
			json = Jsoup.connect(url + "/" + dir + "/" + "receive.json").get().text();
			mapper.generate(codeModel, getWithoutFloor(dir) + "Receive", "binaryAPI.commands."+dir, json);
			codeModel.build(file);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String getWithoutFloor(String str) {
		if (!str.contains("_"))
			return str;
		String[] spl = str.split("_");
		str = "";
		for (String sp : spl) {
			sp = sp.substring(0, 1).toUpperCase() + sp.substring(1);
			str += sp;
		}
		return str;
	}
	
	private static void mkFile(File f) {
		f.mkdirs();
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
