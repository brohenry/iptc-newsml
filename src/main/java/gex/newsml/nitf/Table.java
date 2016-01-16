
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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}caption" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}col" minOccurs="0"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}colgroup" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}thead" minOccurs="0"/>
 *         &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}tfoot" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}tbody"/>
 *           &lt;element ref="{http://iptc.org/std/NITF/2006-10-18/}tr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/NITF/2006-10-18/}commonNITFAttributes"/>
 *       &lt;attribute name="tabletype" type="{http://www.w3.org/2001/XMLSchema}ENTITY" />
 *       &lt;attribute name="align">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="left"/>
 *             &lt;enumeration value="center"/>
 *             &lt;enumeration value="right"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cols" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="border" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="frame">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="void"/>
 *             &lt;enumeration value="above"/>
 *             &lt;enumeration value="below"/>
 *             &lt;enumeration value="hsides"/>
 *             &lt;enumeration value="lhs"/>
 *             &lt;enumeration value="rhs"/>
 *             &lt;enumeration value="vsides"/>
 *             &lt;enumeration value="box"/>
 *             &lt;enumeration value="border"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="rules">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="basic"/>
 *             &lt;enumeration value="rows"/>
 *             &lt;enumeration value="cols"/>
 *             &lt;enumeration value="all"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="cellspacing" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="cellpadding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "caption", "col", "colgroup", "thead", "tfoot", "tbody", "tr" })
@XmlRootElement(name = "table")
@ToString
public class Table {

	protected Caption caption;
	protected Col col;
	protected Colgroup colgroup;
	protected Thead thead;
	protected Tfoot tfoot;
	protected Tbody tbody;
	protected List<Tr> tr;
	@XmlAttribute(name = "tabletype")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "ENTITY")
	protected String tabletype;
	@XmlAttribute(name = "align")
	protected String align;
	@XmlAttribute(name = "width")
	protected String width;
	@XmlAttribute(name = "cols")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NMTOKEN")
	protected String cols;
	@XmlAttribute(name = "border")
	protected String border;
	@XmlAttribute(name = "frame")
	protected String frame;
	@XmlAttribute(name = "rules")
	protected String rules;
	@XmlAttribute(name = "cellspacing")
	protected String cellspacing;
	@XmlAttribute(name = "cellpadding")
	protected String cellpadding;
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
	 * Gets the value of the caption property.
	 * 
	 * @return possible object is {@link Caption }
	 * 
	 */
	public Caption getCaption() {
		return caption;
	}

	/**
	 * Sets the value of the caption property.
	 * 
	 * @param value
	 *            allowed object is {@link Caption }
	 * 
	 */
	public void setCaption(Caption value) {
		this.caption = value;
	}

	/**
	 * Gets the value of the col property.
	 * 
	 * @return possible object is {@link Col }
	 * 
	 */
	public Col getCol() {
		return col;
	}

	/**
	 * Sets the value of the col property.
	 * 
	 * @param value
	 *            allowed object is {@link Col }
	 * 
	 */
	public void setCol(Col value) {
		this.col = value;
	}

	/**
	 * Gets the value of the colgroup property.
	 * 
	 * @return possible object is {@link Colgroup }
	 * 
	 */
	public Colgroup getColgroup() {
		return colgroup;
	}

	/**
	 * Sets the value of the colgroup property.
	 * 
	 * @param value
	 *            allowed object is {@link Colgroup }
	 * 
	 */
	public void setColgroup(Colgroup value) {
		this.colgroup = value;
	}

	/**
	 * Gets the value of the thead property.
	 * 
	 * @return possible object is {@link Thead }
	 * 
	 */
	public Thead getThead() {
		return thead;
	}

	/**
	 * Sets the value of the thead property.
	 * 
	 * @param value
	 *            allowed object is {@link Thead }
	 * 
	 */
	public void setThead(Thead value) {
		this.thead = value;
	}

	/**
	 * Gets the value of the tfoot property.
	 * 
	 * @return possible object is {@link Tfoot }
	 * 
	 */
	public Tfoot getTfoot() {
		return tfoot;
	}

	/**
	 * Sets the value of the tfoot property.
	 * 
	 * @param value
	 *            allowed object is {@link Tfoot }
	 * 
	 */
	public void setTfoot(Tfoot value) {
		this.tfoot = value;
	}

	/**
	 * Gets the value of the tbody property.
	 * 
	 * @return possible object is {@link Tbody }
	 * 
	 */
	public Tbody getTbody() {
		return tbody;
	}

	/**
	 * Sets the value of the tbody property.
	 * 
	 * @param value
	 *            allowed object is {@link Tbody }
	 * 
	 */
	public void setTbody(Tbody value) {
		this.tbody = value;
	}

	/**
	 * Gets the value of the tr property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the tr property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTr().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Tr }
	 * 
	 * 
	 */
	public List<Tr> getTr() {
		if (tr == null) {
			tr = new ArrayList<Tr>();
		}
		return this.tr;
	}

	/**
	 * Gets the value of the tabletype property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTabletype() {
		return tabletype;
	}

	/**
	 * Sets the value of the tabletype property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTabletype(String value) {
		this.tabletype = value;
	}

	/**
	 * Gets the value of the align property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAlign() {
		return align;
	}

	/**
	 * Sets the value of the align property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAlign(String value) {
		this.align = value;
	}

	/**
	 * Gets the value of the width property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * Sets the value of the width property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWidth(String value) {
		this.width = value;
	}

	/**
	 * Gets the value of the cols property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCols() {
		return cols;
	}

	/**
	 * Sets the value of the cols property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCols(String value) {
		this.cols = value;
	}

	/**
	 * Gets the value of the border property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBorder() {
		return border;
	}

	/**
	 * Sets the value of the border property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBorder(String value) {
		this.border = value;
	}

	/**
	 * Gets the value of the frame property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFrame() {
		return frame;
	}

	/**
	 * Sets the value of the frame property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFrame(String value) {
		this.frame = value;
	}

	/**
	 * Gets the value of the rules property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRules() {
		return rules;
	}

	/**
	 * Sets the value of the rules property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRules(String value) {
		this.rules = value;
	}

	/**
	 * Gets the value of the cellspacing property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCellspacing() {
		return cellspacing;
	}

	/**
	 * Sets the value of the cellspacing property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCellspacing(String value) {
		this.cellspacing = value;
	}

	/**
	 * Gets the value of the cellpadding property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCellpadding() {
		return cellpadding;
	}

	/**
	 * Sets the value of the cellpadding property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCellpadding(String value) {
		this.cellpadding = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the clazz property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClazz() {
		return clazz;
	}

	/**
	 * Sets the value of the clazz property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClazz(String value) {
		this.clazz = value;
	}

	/**
	 * Gets the value of the style property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * Sets the value of the style property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStyle(String value) {
		this.style = value;
	}

	/**
	 * Language value governed by RFC3066. Example: en-US.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * Sets the value of the lang property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLang(String value) {
		this.lang = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed
	 * property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string
	 * value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by
	 * updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
