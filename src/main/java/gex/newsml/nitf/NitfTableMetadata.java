
package gex.newsml.nitf;

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
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}nitf-table-summary" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}nitf-colgroup"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}nitf-col"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/NITF/2006-10-18/}commonNITFAttributes"/>
 *       &lt;attribute name="subclass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="idsrc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="pre"/>
 *             &lt;enumeration value="snap-shot"/>
 *             &lt;enumeration value="interim"/>
 *             &lt;enumeration value="final"/>
 *             &lt;enumeration value="official"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="column-count" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="row-count" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "nitfTableSummary",
    "nitfColgroupOrNitfCol"
})
@XmlRootElement(name = "nitf-table-metadata")
public class NitfTableMetadata {

    @XmlElement(name = "nitf-table-summary")
    protected NitfTableSummary nitfTableSummary;
    @XmlElements({
        @XmlElement(name = "nitf-colgroup", type = NitfColgroup.class),
        @XmlElement(name = "nitf-col", type = NitfCol.class)
    })
    protected List<Object> nitfColgroupOrNitfCol;
    @XmlAttribute(name = "subclass")
    protected String subclass;
    @XmlAttribute(name = "idsrc")
    protected String idsrc;
    @XmlAttribute(name = "value")
    protected String value;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "column-count")
    protected String columnCount;
    @XmlAttribute(name = "row-count")
    protected String rowCount;
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
     * Gets the value of the nitfTableSummary property.
     * 
     * @return
     *     possible object is
     *     {@link NitfTableSummary }
     *     
     */
    public NitfTableSummary getNitfTableSummary() {
        return nitfTableSummary;
    }

    /**
     * Sets the value of the nitfTableSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link NitfTableSummary }
     *     
     */
    public void setNitfTableSummary(NitfTableSummary value) {
        this.nitfTableSummary = value;
    }

    /**
     * Gets the value of the nitfColgroupOrNitfCol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nitfColgroupOrNitfCol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNitfColgroupOrNitfCol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NitfColgroup }
     * {@link NitfCol }
     * 
     * 
     */
    public List<Object> getNitfColgroupOrNitfCol() {
        if (nitfColgroupOrNitfCol == null) {
            nitfColgroupOrNitfCol = new ArrayList<Object>();
        }
        return this.nitfColgroupOrNitfCol;
    }

    /**
     * Gets the value of the subclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubclass() {
        return subclass;
    }

    /**
     * Sets the value of the subclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubclass(String value) {
        this.subclass = value;
    }

    /**
     * Gets the value of the idsrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdsrc() {
        return idsrc;
    }

    /**
     * Sets the value of the idsrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdsrc(String value) {
        this.idsrc = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the columnCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnCount() {
        return columnCount;
    }

    /**
     * Sets the value of the columnCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnCount(String value) {
        this.columnCount = value;
    }

    /**
     * Gets the value of the rowCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowCount() {
        return rowCount;
    }

    /**
     * Sets the value of the rowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowCount(String value) {
        this.rowCount = value;
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
