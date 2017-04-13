
package data.binaryAPI.commandsUnused.landing_company;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;


/**
 * Landing Company
 * <p>
 * Landing Company
 * 
 */
public class LandingCompany implements Serializable
{

    /**
     * Country code
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    /**
     * Country name
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * Landing Company for gaming contracts (Volatility Indices)
     * 
     */
    @SerializedName("gaming_company")
    @Expose
    private GamingCompany gamingCompany;
    /**
     * Landing Company for financial contracts (all except Volatility Indices)
     * 
     */
    @SerializedName("financial_company")
    @Expose
    private FinancialCompany financialCompany;
    /**
     * Landing Company for MT5 gaming contracts (Volatility Indices)
     * 
     */
    @SerializedName("mt_gaming_company")
    @Expose
    private MtGamingCompany mtGamingCompany;
    /**
     * Landing Company for MT5 financial contracts (all except Volatility Indices)
     * 
     */
    @SerializedName("mt_financial_company")
    @Expose
    private MtFinancialCompany mtFinancialCompany;
    private final static long serialVersionUID = 5461979396206073511L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LandingCompany() {
    }

    /**
     * 
     * @param mtFinancialCompany
     * @param financialCompany
     * @param mtGamingCompany
     * @param name
     * @param gamingCompany
     * @param id
     */
    public LandingCompany(String id, String name, GamingCompany gamingCompany, FinancialCompany financialCompany, MtGamingCompany mtGamingCompany, MtFinancialCompany mtFinancialCompany) {
        super();
        this.id = id;
        this.name = name;
        this.gamingCompany = gamingCompany;
        this.financialCompany = financialCompany;
        this.mtGamingCompany = mtGamingCompany;
        this.mtFinancialCompany = mtFinancialCompany;
    }

    /**
     * Country code
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * Country code
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Country name
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Country name
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Landing Company for gaming contracts (Volatility Indices)
     * 
     */
    public GamingCompany getGamingCompany() {
        return gamingCompany;
    }

    /**
     * Landing Company for gaming contracts (Volatility Indices)
     * 
     */
    public void setGamingCompany(GamingCompany gamingCompany) {
        this.gamingCompany = gamingCompany;
    }

    /**
     * Landing Company for financial contracts (all except Volatility Indices)
     * 
     */
    public FinancialCompany getFinancialCompany() {
        return financialCompany;
    }

    /**
     * Landing Company for financial contracts (all except Volatility Indices)
     * 
     */
    public void setFinancialCompany(FinancialCompany financialCompany) {
        this.financialCompany = financialCompany;
    }

    /**
     * Landing Company for MT5 gaming contracts (Volatility Indices)
     * 
     */
    public MtGamingCompany getMtGamingCompany() {
        return mtGamingCompany;
    }

    /**
     * Landing Company for MT5 gaming contracts (Volatility Indices)
     * 
     */
    public void setMtGamingCompany(MtGamingCompany mtGamingCompany) {
        this.mtGamingCompany = mtGamingCompany;
    }

    /**
     * Landing Company for MT5 financial contracts (all except Volatility Indices)
     * 
     */
    public MtFinancialCompany getMtFinancialCompany() {
        return mtFinancialCompany;
    }

    /**
     * Landing Company for MT5 financial contracts (all except Volatility Indices)
     * 
     */
    public void setMtFinancialCompany(MtFinancialCompany mtFinancialCompany) {
        this.mtFinancialCompany = mtFinancialCompany;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(name).append(gamingCompany).append(financialCompany).append(mtGamingCompany).append(mtFinancialCompany).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LandingCompany) == false) {
            return false;
        }
        LandingCompany rhs = ((LandingCompany) other);
        return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).append(gamingCompany, rhs.gamingCompany).append(financialCompany, rhs.financialCompany).append(mtGamingCompany, rhs.mtGamingCompany).append(mtFinancialCompany, rhs.mtFinancialCompany).isEquals();
    }

}
