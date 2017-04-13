
package data.binaryAPI.commandsUnused.jp_knowledge_test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Question implements Serializable
{

    /**
     * question id
     * 
     */
    @SerializedName("id")
    @Expose
    private Integer id;
    /**
     * The question
     * 
     */
    @SerializedName("question")
    @Expose
    private String question;
    /**
     * Given answer
     * 
     */
    @SerializedName("answer")
    @Expose
    private Integer answer;
    /**
     * Whether given answer is correct
     * 
     */
    @SerializedName("pass")
    @Expose
    private Integer pass;
    /**
     * Category of the question
     * 
     */
    @SerializedName("category")
    @Expose
    private Integer category;
    private final static long serialVersionUID = 7443646581180697365L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Question() {
    }

    /**
     * 
     * @param question
     * @param answer
     * @param pass
     * @param id
     * @param category
     */
    public Question(Integer id, String question, Integer answer, Integer pass, Integer category) {
        super();
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.pass = pass;
        this.category = category;
    }

    /**
     * question id
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * question id
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The question
     * 
     */
    public String getQuestion() {
        return question;
    }

    /**
     * The question
     * 
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Given answer
     * 
     */
    public Integer getAnswer() {
        return answer;
    }

    /**
     * Given answer
     * 
     */
    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    /**
     * Whether given answer is correct
     * 
     */
    public Integer getPass() {
        return pass;
    }

    /**
     * Whether given answer is correct
     * 
     */
    public void setPass(Integer pass) {
        this.pass = pass;
    }

    /**
     * Category of the question
     * 
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * Category of the question
     * 
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(question).append(answer).append(pass).append(category).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Question) == false) {
            return false;
        }
        Question rhs = ((Question) other);
        return new EqualsBuilder().append(id, rhs.id).append(question, rhs.question).append(answer, rhs.answer).append(pass, rhs.pass).append(category, rhs.category).isEquals();
    }

}
