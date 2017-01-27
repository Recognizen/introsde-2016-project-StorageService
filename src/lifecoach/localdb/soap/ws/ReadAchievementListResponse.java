
package lifecoach.localdb.soap.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readAchievementListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readAchievementListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="achievements" type="{http://ws.soap.localdb.lifecoach/}achievement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readAchievementListResponse", propOrder = {
    "achievements"
})
public class ReadAchievementListResponse {

    protected List<Achievement> achievements;

    /**
     * Gets the value of the achievements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the achievements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAchievements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Achievement }
     * 
     * 
     */
    public List<Achievement> getAchievements() {
        if (achievements == null) {
            achievements = new ArrayList<Achievement>();
        }
        return this.achievements;
    }

}
