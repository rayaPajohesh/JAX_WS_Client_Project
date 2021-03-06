
package DcuServise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getPersonMarriagesReturn" type="{http://Server}marriagesInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPersonMarriagesReturn"
})
@XmlRootElement(name = "getPersonMarriagesResponse")
public class GetPersonMarriagesResponse {

    @XmlElement(required = true)
    protected MarriagesInfo getPersonMarriagesReturn;

    /**
     * Gets the value of the getPersonMarriagesReturn property.
     * 
     * @return
     *     possible object is
     *     {@link MarriagesInfo }
     *     
     */
    public MarriagesInfo getGetPersonMarriagesReturn() {
        return getPersonMarriagesReturn;
    }

    /**
     * Sets the value of the getPersonMarriagesReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarriagesInfo }
     *     
     */
    public void setGetPersonMarriagesReturn(MarriagesInfo value) {
        this.getPersonMarriagesReturn = value;
    }

}
