
package gex.newsml.g2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="line" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>IntlStringType">
 *                 &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *                 &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                 &lt;anyAttribute processContents='lax' namespace='##other'/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="locality" type="{http://iptc.org/std/nar/2006-10-01/}Flex1RolePropType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="area" type="{http://iptc.org/std/nar/2006-10-01/}Flex1RolePropType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="country" type="{http://iptc.org/std/nar/2006-10-01/}Flex1PropType" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://iptc.org/std/nar/2006-10-01/}IntlStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *       &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeListType" />
 *       &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIListType" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "line",
    "locality",
    "area",
    "country",
    "postalCode"
})
public class AddressType {

    protected List<AddressType.Line> line;
    protected List<Flex1RolePropType> locality;
    protected List<Flex1RolePropType> area;
    protected Flex1PropType country;
    protected IntlStringType postalCode;
    @XmlAttribute(name = "role")
    protected List<String> role;
    @XmlAttribute(name = "roleuri")
    protected List<String> roleuri;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "creator")
    protected String creator;
    @XmlAttribute(name = "creatoruri")
    protected String creatoruri;
    @XmlAttribute(name = "modified")
    protected String modified;
    @XmlAttribute(name = "custom")
    protected Boolean custom;
    @XmlAttribute(name = "how")
    protected String how;
    @XmlAttribute(name = "howuri")
    protected String howuri;
    @XmlAttribute(name = "why")
    protected String why;
    @XmlAttribute(name = "whyuri")
    protected String whyuri;
    @XmlAttribute(name = "pubconstraint")
    protected List<String> pubconstraint;
    @XmlAttribute(name = "pubconstrainturi")
    protected List<String> pubconstrainturi;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType.Line }
     * 
     * 
     */
    public List<AddressType.Line> getLine() {
        if (line == null) {
            line = new ArrayList<AddressType.Line>();
        }
        return this.line;
    }

    /**
     * Gets the value of the locality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flex1RolePropType }
     * 
     * 
     */
    public List<Flex1RolePropType> getLocality() {
        if (locality == null) {
            locality = new ArrayList<Flex1RolePropType>();
        }
        return this.locality;
    }

    /**
     * Gets the value of the area property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the area property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flex1RolePropType }
     * 
     * 
     */
    public List<Flex1RolePropType> getArea() {
        if (area == null) {
            area = new ArrayList<Flex1RolePropType>();
        }
        return this.area;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Flex1PropType }
     *     
     */
    public Flex1PropType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flex1PropType }
     *     
     */
    public void setCountry(Flex1PropType value) {
        this.country = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link IntlStringType }
     *     
     */
    public IntlStringType getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntlStringType }
     *     
     */
    public void setPostalCode(IntlStringType value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRole() {
        if (role == null) {
            role = new ArrayList<String>();
        }
        return this.role;
    }

    /**
     * Gets the value of the roleuri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleuri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleuri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoleuri() {
        if (roleuri == null) {
            roleuri = new ArrayList<String>();
        }
        return this.roleuri;
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
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the creatoruri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatoruri() {
        return creatoruri;
    }

    /**
     * Sets the value of the creatoruri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatoruri(String value) {
        this.creatoruri = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModified(String value) {
        this.modified = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustom(Boolean value) {
        this.custom = value;
    }

    /**
     * Gets the value of the how property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHow() {
        return how;
    }

    /**
     * Sets the value of the how property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHow(String value) {
        this.how = value;
    }

    /**
     * Gets the value of the howuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHowuri() {
        return howuri;
    }

    /**
     * Sets the value of the howuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHowuri(String value) {
        this.howuri = value;
    }

    /**
     * Gets the value of the why property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhy() {
        return why;
    }

    /**
     * Sets the value of the why property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhy(String value) {
        this.why = value;
    }

    /**
     * Gets the value of the whyuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhyuri() {
        return whyuri;
    }

    /**
     * Sets the value of the whyuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhyuri(String value) {
        this.whyuri = value;
    }

    /**
     * Gets the value of the pubconstraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubconstraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubconstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPubconstraint() {
        if (pubconstraint == null) {
            pubconstraint = new ArrayList<String>();
        }
        return this.pubconstraint;
    }

    /**
     * Gets the value of the pubconstrainturi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubconstrainturi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubconstrainturi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPubconstrainturi() {
        if (pubconstrainturi == null) {
            pubconstrainturi = new ArrayList<String>();
        }
        return this.pubconstrainturi;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://iptc.org/std/nar/2006-10-01/>IntlStringType">
     *       &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
     *       &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
     *       &lt;anyAttribute processContents='lax' namespace='##other'/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Line
        extends IntlStringType
    {

        @XmlAttribute(name = "role")
        protected String role;
        @XmlAttribute(name = "roleuri")
        protected String roleuri;

        /**
         * Gets the value of the role property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRole() {
            return role;
        }

        /**
         * Sets the value of the role property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRole(String value) {
            this.role = value;
        }

        /**
         * Gets the value of the roleuri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoleuri() {
            return roleuri;
        }

        /**
         * Sets the value of the roleuri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoleuri(String value) {
            this.roleuri = value;
        }

    }

}