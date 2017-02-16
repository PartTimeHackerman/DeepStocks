
package binaryAPI.commands.ticks_history;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import data.StockData;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@ToString(exclude = "stock")
@Entity
@Table(name = "candles")
@IdClass(Candle.CandlePK.class)
public class Candle implements Serializable
{
    @Id
    private StockData stock;
    
    /**
     * It is an epoch value
     * 
     */
    @Id
    @Column(name = "epoch")
    @SerializedName("epoch")
    @Expose
    private Long epoch;
    
    /**
     * It is the open price value for the given time
     * 
     */
    @SerializedName("open")
    @Expose
    private Double open;
    
    /**
     * It is the high price value for the given time
     * 
     */
    @SerializedName("high")
    @Expose
    private Double high;
    
    /**
     * It is the low price value for the given time
     * 
     */
    @SerializedName("low")
    @Expose
    private Double low;
    
    /**
     * It is the close price value for the given time
     * 
     */
    @SerializedName("close")
    @Expose
    private Double close;
    
    private final static long serialVersionUID = -8683231578361442030L;
    
    @SerializedName("volume")
    @Expose
    private Integer volume;
    
    /**
     * No args constructor for use in serialization
     * 
     */
    public Candle() {}
    
    public Candle(Long epoch, Double open, Double high, Double low, Double close) {
        super();
        this.epoch = epoch;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(epoch).append(open).append(high).append(low).append(close).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Candle) == false) {
            return false;
        }
        Candle rhs = ((Candle) other);
        return new EqualsBuilder().append(epoch, rhs.epoch).append(open, rhs.open).append(high, rhs.high).append(low, rhs.low).append(close, rhs.close).isEquals();
    }
    
    @EqualsAndHashCode
    public static class CandlePK implements Serializable {
    
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "stockId", referencedColumnName = "id", insertable = false, updatable = false)
        private StockData stock;
        
        private Long epoch;
        
        public CandlePK(){}
    
    
        public Long getEpoch() {
            return epoch;
        }
    
        public void setEpoch(Long epoch) {
            this.epoch = epoch;
        }
    
        public void setStock(StockData stock) {
            this.stock = stock;
        }
    }
}
