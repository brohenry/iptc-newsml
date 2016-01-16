
package gex.newsml.v12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import lombok.ToString;

/**
 * A property of a NewsItem, NewsComponent, ContentItem, Topic, Location or
 * Party. The property has a name and either a simple Value or a complex value
 * consisting of a set of further properties. The property has a name and either
 * a simple Value or a complex value consisting of a set of further properties.
 * 
 * <p>
 * Java class for PropertyType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}assignment"/>
 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *       &lt;attribute name="Value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ValueRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AllowedValues" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AllowedScheme" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyType", propOrder = { "property" })
@ToString
public class PropertyType {

	@XmlElement(name = "Property")
	protected List<PropertyType> property;
	@XmlAttribute(name = "Value")
	protected String value;
	@XmlAttribute(name = "ValueRef")
	protected String valueRef;
	@XmlAttribute(name = "AllowedValues")
	protected String allowedValues;
	@XmlAttribute(name = "AllowedScheme")
	protected String allowedScheme;
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
	@XmlAttribute(name = "FormalName", required = true)
	protected String formalName;
	@XmlAttribute(name = "Vocabulary")
	protected String vocabulary;
	@XmlAttribute(name = "Scheme")
	protected String scheme;

	/**
	 * Gets the value of the property property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the property property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getProperty().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link PropertyType }
	 * 
	 * 
	 */
	public List<PropertyType> getProperty() {
		if (property == null) {
			property = new ArrayList<PropertyType>();
		}
		return this.property;
	}

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the valueRef property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValueRef() {
		return valueRef;
	}

	/**
	 * Sets the value of the valueRef property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValueRef(String value) {
		this.valueRef = value;
	}

	/**
	 * Gets the value of the allowedValues property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAllowedValues() {
		return allowedValues;
	}

	/**
	 * Sets the value of the allowedValues property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAllowedValues(String value) {
		this.allowedValues = value;
	}

	/**
	 * Gets the value of the allowedScheme property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAllowedScheme() {
		return allowedScheme;
	}

	/**
	 * Sets the value of the allowedScheme property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAllowedScheme(String value) {
		this.allowedScheme = value;
	}

	/**
	 * Gets the value of the duid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDuid() {
		return duid;
	}

	/**
	 * Sets the value of the duid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDuid(String value) {
		this.duid = value;
	}

	/**
	 * Gets the value of the euid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEuid() {
		return euid;
	}

	/**
	 * Sets the value of the euid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEuid(String value) {
		this.euid = value;
	}

	/**
	 * Gets the value of the assignedBy property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAssignedBy() {
		return assignedBy;
	}

	/**
	 * Sets the value of the assignedBy property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAssignedBy(String value) {
		this.assignedBy = value;
	}

	/**
	 * Gets the value of the importance property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getImportance() {
		return importance;
	}

	/**
	 * Sets the value of the importance property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setImportance(String value) {
		this.importance = value;
	}

	/**
	 * Gets the value of the confidence property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConfidence() {
		return confidence;
	}

	/**
	 * Sets the value of the confidence property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConfidence(String value) {
		this.confidence = value;
	}

	/**
	 * Gets the value of the howPresent property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHowPresent() {
		return howPresent;
	}

	/**
	 * Sets the value of the howPresent property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHowPresent(String value) {
		this.howPresent = value;
	}

	/**
	 * Gets the value of the dateAndTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDateAndTime() {
		return dateAndTime;
	}

	/**
	 * Sets the value of the dateAndTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDateAndTime(String value) {
		this.dateAndTime = value;
	}

	/**
	 * Gets the value of the formalName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFormalName() {
		return formalName;
	}

	/**
	 * Sets the value of the formalName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFormalName(String value) {
		this.formalName = value;
	}

	/**
	 * Gets the value of the vocabulary property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVocabulary() {
		return vocabulary;
	}

	/**
	 * Sets the value of the vocabulary property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVocabulary(String value) {
		this.vocabulary = value;
	}

	/**
	 * Gets the value of the scheme property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getScheme() {
		return scheme;
	}

	/**
	 * Sets the value of the scheme property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setScheme(String value) {
		this.scheme = value;
	}

}
