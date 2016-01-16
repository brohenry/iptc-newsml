
package gex.newsml.nitf;

import lombok.ToString;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


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
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}addressee"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}delivery.point" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}postcode"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}delivery.office"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}region"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}country"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/NITF/2006-10-18/}commonNITFAttributes"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addressee",
    "deliveryPoint",
    "postcodeOrDeliveryOfficeOrRegion"
})
@XmlRootElement(name = "postaddr")
@ToString public class Postaddr {

    @XmlElement(required = true)
    protected Addressee addressee;
    @XmlElement(name = "delivery.point")
    protected DeliveryPoint deliveryPoint;
    @XmlElements({
        @XmlElement(name = "postcode", type = Postcode.class),
        @XmlElement(name = "delivery.office", type = DeliveryOffice.class),
        @XmlElement(name = "region", type = Region.class),
        @XmlElement(name = "country", type = Country.class)
    })
    protected List<Object> postcodeOrDeliveryOfficeOrRegion;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the addressee property.
     * 
     * @return
     *     possible object is
     *     {@link Addressee }
     *     
     */
    public Addressee getAddressee() {
        return addressee;
    }

    /**
     * Sets the value of the addressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Addressee }
     *     
     */
    public void setAddressee(Addressee value) {
        this.addressee = value;
    }

    /**
     * Gets the value of the deliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryPoint }
     *     
     */
    public DeliveryPoint getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * Sets the value of the deliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryPoint }
     *     
     */
    public void setDeliveryPoint(DeliveryPoint value) {
        this.deliveryPoint = value;
    }

    /**
     * Gets the value of the postcodeOrDeliveryOfficeOrRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postcodeOrDeliveryOfficeOrRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostcodeOrDeliveryOfficeOrRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Postcode }
     * {@link DeliveryOffice }
     * {@link Region }
     * {@link Country }
     * 
     * 
     */
    public List<Object> getPostcodeOrDeliveryOfficeOrRegion() {
        if (postcodeOrDeliveryOfficeOrRegion == null) {
            postcodeOrDeliveryOfficeOrRegion = new ArrayList<Object>();
        }
        return this.postcodeOrDeliveryOfficeOrRegion;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Language value governed by RFC3066. Example: en-US.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
