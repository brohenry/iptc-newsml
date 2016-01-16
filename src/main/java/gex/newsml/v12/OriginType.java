
package gex.newsml.v12;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import lombok.ToString;

/**
 * A wrapper for all or part of the text of a piece of text, which provides a pointer to an item of data corresponding formally to what is being described here in natural language. The Href attribute identifies the relevant data, and may be an http URL or a NewsML URN as described in the comment to PublicIdentifier, optionally including a fragment identifier. Alternatively, it can be a simple fragment identifier consisting of a # character followed by the value of the Duid of an element in the current document.
 * 
 * <p>Java class for OriginType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Origin" type="{http://iptc.org/std/NewsML/2003-10-10/}OriginType"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *       &lt;attribute name="Href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginType", propOrder = {
    "content"
})
@ToString
public class OriginType {

    @XmlElementRef(name = "Origin", namespace = "http://iptc.org/std/NewsML/2003-10-10/", type = JAXBElement.class, required = false)
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "Href")
    protected String href;
    @XmlAttribute(name = "Duid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String duid;
    @XmlAttribute(name = "Euid")
    protected String euid;
    @XmlAttribute(name = "AssignedBy")
    protected String assignedBy;
    @XmlAttribute(name = "Importance")
    protected String importance;
    @XmlAttribute(name = "Confidence")
    protected String confidence;
    @XmlAttribute(name = "HowPresent")
    protected String howPresent;
    @XmlAttribute(name = "DateAndTime")
    protected String dateAndTime;

    /**
     * A wrapper for all or part of the text of a piece of text, which provides a pointer to an item of data corresponding formally to what is being described here in natural language. The Href attribute identifies the relevant data, and may be an http URL or a NewsML URN as described in the comment to PublicIdentifier, optionally including a fragment identifier. Alternatively, it can be a simple fragment identifier consisting of a # character followed by the value of the Duid of an element in the current document.Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OriginType }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the duid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuid() {
        return duid;
    }

    /**
     * Sets the value of the duid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuid(String value) {
        this.duid = value;
    }

    /**
     * Gets the value of the euid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuid() {
        return euid;
    }

    /**
     * Sets the value of the euid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuid(String value) {
        this.euid = value;
    }

    /**
     * Gets the value of the assignedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedBy() {
        return assignedBy;
    }

    /**
     * Sets the value of the assignedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedBy(String value) {
        this.assignedBy = value;
    }

    /**
     * Gets the value of the importance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportance() {
        return importance;
    }

    /**
     * Sets the value of the importance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportance(String value) {
        this.importance = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidence(String value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the howPresent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHowPresent() {
        return howPresent;
    }

    /**
     * Sets the value of the howPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHowPresent(String value) {
        this.howPresent = value;
    }

    /**
     * Gets the value of the dateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateAndTime() {
        return dateAndTime;
    }

    /**
     * Sets the value of the dateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateAndTime(String value) {
        this.dateAndTime = value;
    }

}
