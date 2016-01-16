
package gex.newsml.g2;

import lombok.ToString;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * The type with details specific to an event
 * 
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
 *         &lt;element name="dates">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="start" type="{http://iptc.org/std/nar/2006-10-01/}ApproximateDateTimePropType"/>
 *                   &lt;choice minOccurs="0">
 *                     &lt;element name="end" type="{http://iptc.org/std/nar/2006-10-01/}ApproximateDateTimePropType"/>
 *                     &lt;element name="duration">
 *                       &lt;complexType>
 *                         &lt;simpleContent>
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>duration">
 *                             &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *                           &lt;/extension>
 *                         &lt;/simpleContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;group ref="{http://iptc.org/std/nar/2006-10-01/}RecurrenceGroup" minOccurs="0"/>
 *                   &lt;element name="confirmation" type="{http://iptc.org/std/nar/2006-10-01/}QCodePropType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="occurStatus" type="{http://iptc.org/std/nar/2006-10-01/}QualPropType" minOccurs="0"/>
 *         &lt;element name="newsCoverageStatus" type="{http://iptc.org/std/nar/2006-10-01/}QualPropType" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="registration" type="{http://iptc.org/std/nar/2006-10-01/}BlockType"/>
 *           &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}keyword"/>
 *           &lt;element name="accessStatus" type="{http://iptc.org/std/nar/2006-10-01/}QualPropType"/>
 *           &lt;element name="participationRequirement">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}Flex1PropType">
 *                   &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *                   &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                   &lt;anyAttribute processContents='lax' namespace='##other'/>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="subject" type="{http://iptc.org/std/nar/2006-10-01/}Flex1ConceptPropType"/>
 *           &lt;element name="location">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}FlexLocationPropType">
 *                   &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *                   &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                   &lt;anyAttribute processContents='lax' namespace='##other'/>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="participant" type="{http://iptc.org/std/nar/2006-10-01/}Flex1PartyPropType"/>
 *           &lt;element name="organiser" type="{http://iptc.org/std/nar/2006-10-01/}Flex1PartyPropType"/>
 *           &lt;element name="contactInfo" type="{http://iptc.org/std/nar/2006-10-01/}ContactInfoType"/>
 *           &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}language"/>
 *           &lt;element name="newsCoverage">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="g2contentType" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;simpleContent>
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                             &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *                           &lt;/extension>
 *                         &lt;/simpleContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}itemClass" minOccurs="0"/>
 *                     &lt;element name="assignedTo" type="{http://iptc.org/std/nar/2006-10-01/}Flex1PartyPropType" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element name="scheduled" type="{http://iptc.org/std/nar/2006-10-01/}ApproximateDateTimePropType" minOccurs="0"/>
 *                     &lt;element name="service" type="{http://iptc.org/std/nar/2006-10-01/}QualPropType" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element name="edNote" type="{http://iptc.org/std/nar/2006-10-01/}BlockType" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;group ref="{http://iptc.org/std/nar/2006-10-01/}DescriptiveMetadataGroup" minOccurs="0"/>
 *                     &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
 *                   &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
 *                   &lt;anyAttribute namespace='##other'/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
 *       &lt;anyAttribute processContents='lax' namespace=''/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "dates", "occurStatus", "newsCoverageStatus", "registrationOrKeywordOrAccessStatus",
		"any" })
@XmlRootElement(name = "eventDetails")
@ToString
public class EventDetails {

	@XmlElement(required = true)
	protected EventDetails.Dates dates;
	protected QualPropType occurStatus;
	protected QualPropType newsCoverageStatus;
	@XmlElementRefs({
			@XmlElementRef(name = "keyword", namespace = "http://iptc.org/std/nar/2006-10-01/", type = Keyword.class, required = false),
			@XmlElementRef(name = "subject", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "newsCoverage", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "participationRequirement", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "language", namespace = "http://iptc.org/std/nar/2006-10-01/", type = Language.class, required = false),
			@XmlElementRef(name = "participant", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "accessStatus", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "contactInfo", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "location", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "registration", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "organiser", namespace = "http://iptc.org/std/nar/2006-10-01/", type = JAXBElement.class, required = false) })
	protected List<Object> registrationOrKeywordOrAccessStatus;
	@XmlAnyElement(lax = true)
	protected List<Object> any;
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
	 * Gets the value of the dates property.
	 * 
	 * @return possible object is {@link EventDetails.Dates }
	 * 
	 */
	public EventDetails.Dates getDates() {
		return dates;
	}

	/**
	 * Sets the value of the dates property.
	 * 
	 * @param value
	 *            allowed object is {@link EventDetails.Dates }
	 * 
	 */
	public void setDates(EventDetails.Dates value) {
		this.dates = value;
	}

	/**
	 * Gets the value of the occurStatus property.
	 * 
	 * @return possible object is {@link QualPropType }
	 * 
	 */
	public QualPropType getOccurStatus() {
		return occurStatus;
	}

	/**
	 * Sets the value of the occurStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link QualPropType }
	 * 
	 */
	public void setOccurStatus(QualPropType value) {
		this.occurStatus = value;
	}

	/**
	 * Gets the value of the newsCoverageStatus property.
	 * 
	 * @return possible object is {@link QualPropType }
	 * 
	 */
	public QualPropType getNewsCoverageStatus() {
		return newsCoverageStatus;
	}

	/**
	 * Sets the value of the newsCoverageStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link QualPropType }
	 * 
	 */
	public void setNewsCoverageStatus(QualPropType value) {
		this.newsCoverageStatus = value;
	}

	/**
	 * Gets the value of the registrationOrKeywordOrAccessStatus property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the registrationOrKeywordOrAccessStatus
	 * property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRegistrationOrKeywordOrAccessStatus().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Keyword }
	 * {@link JAXBElement }{@code <}{@link Flex1ConceptPropType }{@code >}
	 * {@link JAXBElement }{@code <}{@link EventDetails.NewsCoverage }{@code >}
	 * {@link JAXBElement }{@code <}{@link EventDetails.ParticipationRequirement
	 * }{@code >} {@link Language } {@link JAXBElement }{@code <}
	 * {@link Flex1PartyPropType }{@code >} {@link JAXBElement }{@code <}
	 * {@link QualPropType }{@code >} {@link JAXBElement }{@code <}
	 * {@link ContactInfoType }{@code >} {@link JAXBElement }{@code <}
	 * {@link EventDetails.Location }{@code >} {@link JAXBElement }{@code <}
	 * {@link BlockType }{@code >} {@link JAXBElement }{@code <}
	 * {@link Flex1PartyPropType }{@code >}
	 * 
	 * 
	 */
	public List<Object> getRegistrationOrKeywordOrAccessStatus() {
		if (registrationOrKeywordOrAccessStatus == null) {
			registrationOrKeywordOrAccessStatus = new ArrayList<Object>();
		}
		return this.registrationOrKeywordOrAccessStatus;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object }
	 * 
	 * 
	 */
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<Object>();
		}
		return this.any;
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
	 * Gets the value of the creator property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * Sets the value of the creator property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreator(String value) {
		this.creator = value;
	}

	/**
	 * Gets the value of the creatoruri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreatoruri() {
		return creatoruri;
	}

	/**
	 * Sets the value of the creatoruri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreatoruri(String value) {
		this.creatoruri = value;
	}

	/**
	 * Gets the value of the modified property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getModified() {
		return modified;
	}

	/**
	 * Sets the value of the modified property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setModified(String value) {
		this.modified = value;
	}

	/**
	 * Gets the value of the custom property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isCustom() {
		return custom;
	}

	/**
	 * Sets the value of the custom property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setCustom(Boolean value) {
		this.custom = value;
	}

	/**
	 * Gets the value of the how property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHow() {
		return how;
	}

	/**
	 * Sets the value of the how property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHow(String value) {
		this.how = value;
	}

	/**
	 * Gets the value of the howuri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHowuri() {
		return howuri;
	}

	/**
	 * Sets the value of the howuri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHowuri(String value) {
		this.howuri = value;
	}

	/**
	 * Gets the value of the why property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWhy() {
		return why;
	}

	/**
	 * Sets the value of the why property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWhy(String value) {
		this.why = value;
	}

	/**
	 * Gets the value of the whyuri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getWhyuri() {
		return whyuri;
	}

	/**
	 * Sets the value of the whyuri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setWhyuri(String value) {
		this.whyuri = value;
	}

	/**
	 * Gets the value of the pubconstraint property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the pubconstraint property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPubconstraint().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
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
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the pubconstrainturi property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPubconstrainturi().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
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

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="start" type="{http://iptc.org/std/nar/2006-10-01/}ApproximateDateTimePropType"/>
	 *         &lt;choice minOccurs="0">
	 *           &lt;element name="end" type="{http://iptc.org/std/nar/2006-10-01/}ApproximateDateTimePropType"/>
	 *           &lt;element name="duration">
	 *             &lt;complexType>
	 *               &lt;simpleContent>
	 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>duration">
	 *                   &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
	 *                 &lt;/extension>
	 *               &lt;/simpleContent>
	 *             &lt;/complexType>
	 *           &lt;/element>
	 *         &lt;/choice>
	 *         &lt;group ref="{http://iptc.org/std/nar/2006-10-01/}RecurrenceGroup" minOccurs="0"/>
	 *         &lt;element name="confirmation" type="{http://iptc.org/std/nar/2006-10-01/}QCodePropType" minOccurs="0"/>
	 *       &lt;/sequence>
	 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "start", "end", "duration", "rDateOrRRule", "exDateOrExRule", "confirmation" })
	@ToString
	public static class Dates {

		@XmlElement(required = true)
		protected ApproximateDateTimePropType start;
		protected ApproximateDateTimePropType end;
		protected EventDetails.Dates.Duration duration;
		@XmlElements({ @XmlElement(name = "rDate", type = DateOptTimePropType.class),
				@XmlElement(name = "rRule", type = EventDetails.Dates.RRule.class) })
		protected List<Object> rDateOrRRule;
		@XmlElements({ @XmlElement(name = "exDate", type = DateOptTimePropType.class),
				@XmlElement(name = "exRule", type = EventDetails.Dates.ExRule.class) })
		protected List<Object> exDateOrExRule;
		protected QCodePropType confirmation;
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

		/**
		 * Gets the value of the start property.
		 * 
		 * @return possible object is {@link ApproximateDateTimePropType }
		 * 
		 */
		public ApproximateDateTimePropType getStart() {
			return start;
		}

		/**
		 * Sets the value of the start property.
		 * 
		 * @param value
		 *            allowed object is {@link ApproximateDateTimePropType }
		 * 
		 */
		public void setStart(ApproximateDateTimePropType value) {
			this.start = value;
		}

		/**
		 * Gets the value of the end property.
		 * 
		 * @return possible object is {@link ApproximateDateTimePropType }
		 * 
		 */
		public ApproximateDateTimePropType getEnd() {
			return end;
		}

		/**
		 * Sets the value of the end property.
		 * 
		 * @param value
		 *            allowed object is {@link ApproximateDateTimePropType }
		 * 
		 */
		public void setEnd(ApproximateDateTimePropType value) {
			this.end = value;
		}

		/**
		 * Gets the value of the duration property.
		 * 
		 * @return possible object is {@link EventDetails.Dates.Duration }
		 * 
		 */
		public EventDetails.Dates.Duration getDuration() {
			return duration;
		}

		/**
		 * Sets the value of the duration property.
		 * 
		 * @param value
		 *            allowed object is {@link EventDetails.Dates.Duration }
		 * 
		 */
		public void setDuration(EventDetails.Dates.Duration value) {
			this.duration = value;
		}

		/**
		 * Gets the value of the rDateOrRRule property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the rDateOrRRule property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getRDateOrRRule().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link DateOptTimePropType } {@link EventDetails.Dates.RRule }
		 * 
		 * 
		 */
		public List<Object> getRDateOrRRule() {
			if (rDateOrRRule == null) {
				rDateOrRRule = new ArrayList<Object>();
			}
			return this.rDateOrRRule;
		}

		/**
		 * Gets the value of the exDateOrExRule property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the exDateOrExRule property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getExDateOrExRule().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link DateOptTimePropType } {@link EventDetails.Dates.ExRule }
		 * 
		 * 
		 */
		public List<Object> getExDateOrExRule() {
			if (exDateOrExRule == null) {
				exDateOrExRule = new ArrayList<Object>();
			}
			return this.exDateOrExRule;
		}

		/**
		 * Gets the value of the confirmation property.
		 * 
		 * @return possible object is {@link QCodePropType }
		 * 
		 */
		public QCodePropType getConfirmation() {
			return confirmation;
		}

		/**
		 * Sets the value of the confirmation property.
		 * 
		 * @param value
		 *            allowed object is {@link QCodePropType }
		 * 
		 */
		public void setConfirmation(QCodePropType value) {
			this.confirmation = value;
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
		 * Gets the value of the creator property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCreator() {
			return creator;
		}

		/**
		 * Sets the value of the creator property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCreator(String value) {
			this.creator = value;
		}

		/**
		 * Gets the value of the creatoruri property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCreatoruri() {
			return creatoruri;
		}

		/**
		 * Sets the value of the creatoruri property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setCreatoruri(String value) {
			this.creatoruri = value;
		}

		/**
		 * Gets the value of the modified property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getModified() {
			return modified;
		}

		/**
		 * Sets the value of the modified property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setModified(String value) {
			this.modified = value;
		}

		/**
		 * Gets the value of the custom property.
		 * 
		 * @return possible object is {@link Boolean }
		 * 
		 */
		public Boolean isCustom() {
			return custom;
		}

		/**
		 * Sets the value of the custom property.
		 * 
		 * @param value
		 *            allowed object is {@link Boolean }
		 * 
		 */
		public void setCustom(Boolean value) {
			this.custom = value;
		}

		/**
		 * Gets the value of the how property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getHow() {
			return how;
		}

		/**
		 * Sets the value of the how property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setHow(String value) {
			this.how = value;
		}

		/**
		 * Gets the value of the howuri property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getHowuri() {
			return howuri;
		}

		/**
		 * Sets the value of the howuri property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setHowuri(String value) {
			this.howuri = value;
		}

		/**
		 * Gets the value of the why property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getWhy() {
			return why;
		}

		/**
		 * Sets the value of the why property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setWhy(String value) {
			this.why = value;
		}

		/**
		 * Gets the value of the whyuri property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getWhyuri() {
			return whyuri;
		}

		/**
		 * Sets the value of the whyuri property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setWhyuri(String value) {
			this.whyuri = value;
		}

		/**
		 * Gets the value of the pubconstraint property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the pubconstraint property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getPubconstraint().add(newItem);
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
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the pubconstrainturi property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getPubconstrainturi().add(newItem);
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
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;simpleContent>
		 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>duration">
		 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
		 *     &lt;/extension>
		 *   &lt;/simpleContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "value" })
		@ToString
		public static class Duration {

			@XmlValue
			protected javax.xml.datatype.Duration value;
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

			/**
			 * Gets the value of the value property.
			 * 
			 * @return possible object is {@link javax.xml.datatype.Duration }
			 * 
			 */
			public javax.xml.datatype.Duration getValue() {
				return value;
			}

			/**
			 * Sets the value of the value property.
			 * 
			 * @param value
			 *            allowed object is {@link javax.xml.datatype.Duration }
			 * 
			 */
			public void setValue(javax.xml.datatype.Duration value) {
				this.value = value;
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
			 * Gets the value of the creator property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCreator() {
				return creator;
			}

			/**
			 * Sets the value of the creator property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCreator(String value) {
				this.creator = value;
			}

			/**
			 * Gets the value of the creatoruri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCreatoruri() {
				return creatoruri;
			}

			/**
			 * Sets the value of the creatoruri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCreatoruri(String value) {
				this.creatoruri = value;
			}

			/**
			 * Gets the value of the modified property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModified() {
				return modified;
			}

			/**
			 * Sets the value of the modified property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModified(String value) {
				this.modified = value;
			}

			/**
			 * Gets the value of the custom property.
			 * 
			 * @return possible object is {@link Boolean }
			 * 
			 */
			public Boolean isCustom() {
				return custom;
			}

			/**
			 * Sets the value of the custom property.
			 * 
			 * @param value
			 *            allowed object is {@link Boolean }
			 * 
			 */
			public void setCustom(Boolean value) {
				this.custom = value;
			}

			/**
			 * Gets the value of the how property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHow() {
				return how;
			}

			/**
			 * Sets the value of the how property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHow(String value) {
				this.how = value;
			}

			/**
			 * Gets the value of the howuri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHowuri() {
				return howuri;
			}

			/**
			 * Sets the value of the howuri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHowuri(String value) {
				this.howuri = value;
			}

			/**
			 * Gets the value of the why property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getWhy() {
				return why;
			}

			/**
			 * Sets the value of the why property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setWhy(String value) {
				this.why = value;
			}

			/**
			 * Gets the value of the whyuri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getWhyuri() {
				return whyuri;
			}

			/**
			 * Sets the value of the whyuri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setWhyuri(String value) {
				this.whyuri = value;
			}

			/**
			 * Gets the value of the pubconstraint property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the pubconstraint property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getPubconstraint().add(newItem);
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
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the pubconstrainturi property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getPubconstrainturi().add(newItem);
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

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}recurrenceRuleAttributes"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
		 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class ExRule {

			@XmlAttribute(name = "freq", required = true)
			protected String freq;
			@XmlAttribute(name = "interval")
			@XmlSchemaType(name = "positiveInteger")
			protected BigInteger interval;
			@XmlAttribute(name = "until")
			protected String until;
			@XmlAttribute(name = "count")
			@XmlSchemaType(name = "positiveInteger")
			protected BigInteger count;
			@XmlAttribute(name = "bysecond")
			protected List<Integer> bysecond;
			@XmlAttribute(name = "byminute")
			protected List<Integer> byminute;
			@XmlAttribute(name = "byhour")
			protected List<Integer> byhour;
			@XmlAttribute(name = "byday")
			protected List<String> byday;
			@XmlAttribute(name = "bymonthday")
			protected List<String> bymonthday;
			@XmlAttribute(name = "bymonth")
			protected List<Integer> bymonth;
			@XmlAttribute(name = "byyearday")
			protected List<String> byyearday;
			@XmlAttribute(name = "byweekno")
			protected List<String> byweekno;
			@XmlAttribute(name = "bysetpos")
			protected List<String> bysetpos;
			@XmlAttribute(name = "wkst")
			protected String wkst;
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
			 * Gets the value of the freq property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getFreq() {
				return freq;
			}

			/**
			 * Sets the value of the freq property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setFreq(String value) {
				this.freq = value;
			}

			/**
			 * Gets the value of the interval property.
			 * 
			 * @return possible object is {@link BigInteger }
			 * 
			 */
			public BigInteger getInterval() {
				return interval;
			}

			/**
			 * Sets the value of the interval property.
			 * 
			 * @param value
			 *            allowed object is {@link BigInteger }
			 * 
			 */
			public void setInterval(BigInteger value) {
				this.interval = value;
			}

			/**
			 * Gets the value of the until property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getUntil() {
				return until;
			}

			/**
			 * Sets the value of the until property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setUntil(String value) {
				this.until = value;
			}

			/**
			 * Gets the value of the count property.
			 * 
			 * @return possible object is {@link BigInteger }
			 * 
			 */
			public BigInteger getCount() {
				return count;
			}

			/**
			 * Sets the value of the count property.
			 * 
			 * @param value
			 *            allowed object is {@link BigInteger }
			 * 
			 */
			public void setCount(BigInteger value) {
				this.count = value;
			}

			/**
			 * Gets the value of the bysecond property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the bysecond property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getBysecond().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link Integer }
			 * 
			 * 
			 */
			public List<Integer> getBysecond() {
				if (bysecond == null) {
					bysecond = new ArrayList<Integer>();
				}
				return this.bysecond;
			}

			/**
			 * Gets the value of the byminute property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the byminute property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getByminute().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link Integer }
			 * 
			 * 
			 */
			public List<Integer> getByminute() {
				if (byminute == null) {
					byminute = new ArrayList<Integer>();
				}
				return this.byminute;
			}

			/**
			 * Gets the value of the byhour property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the byhour property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getByhour().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link Integer }
			 * 
			 * 
			 */
			public List<Integer> getByhour() {
				if (byhour == null) {
					byhour = new ArrayList<Integer>();
				}
				return this.byhour;
			}

			/**
			 * Gets the value of the byday property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the byday property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getByday().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link String }
			 * 
			 * 
			 */
			public List<String> getByday() {
				if (byday == null) {
					byday = new ArrayList<String>();
				}
				return this.byday;
			}

			/**
			 * Gets the value of the bymonthday property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the bymonthday property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getBymonthday().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link String }
			 * 
			 * 
			 */
			public List<String> getBymonthday() {
				if (bymonthday == null) {
					bymonthday = new ArrayList<String>();
				}
				return this.bymonthday;
			}

			/**
			 * Gets the value of the bymonth property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the bymonth property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getBymonth().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link Integer }
			 * 
			 * 
			 */
			public List<Integer> getBymonth() {
				if (bymonth == null) {
					bymonth = new ArrayList<Integer>();
				}
				return this.bymonth;
			}

			/**
			 * Gets the value of the byyearday property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the byyearday property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getByyearday().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link String }
			 * 
			 * 
			 */
			public List<String> getByyearday() {
				if (byyearday == null) {
					byyearday = new ArrayList<String>();
				}
				return this.byyearday;
			}

			/**
			 * Gets the value of the byweekno property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the byweekno property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getByweekno().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link String }
			 * 
			 * 
			 */
			public List<String> getByweekno() {
				if (byweekno == null) {
					byweekno = new ArrayList<String>();
				}
				return this.byweekno;
			}

			/**
			 * Gets the value of the bysetpos property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the bysetpos property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getBysetpos().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link String }
			 * 
			 * 
			 */
			public List<String> getBysetpos() {
				if (bysetpos == null) {
					bysetpos = new ArrayList<String>();
				}
				return this.bysetpos;
			}

			/**
			 * Gets the value of the wkst property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getWkst() {
				return wkst;
			}

			/**
			 * Sets the value of the wkst property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setWkst(String value) {
				this.wkst = value;
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
			 * Gets the value of the creator property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCreator() {
				return creator;
			}

			/**
			 * Sets the value of the creator property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCreator(String value) {
				this.creator = value;
			}

			/**
			 * Gets the value of the creatoruri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCreatoruri() {
				return creatoruri;
			}

			/**
			 * Sets the value of the creatoruri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCreatoruri(String value) {
				this.creatoruri = value;
			}

			/**
			 * Gets the value of the modified property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModified() {
				return modified;
			}

			/**
			 * Sets the value of the modified property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModified(String value) {
				this.modified = value;
			}

			/**
			 * Gets the value of the custom property.
			 * 
			 * @return possible object is {@link Boolean }
			 * 
			 */
			public Boolean isCustom() {
				return custom;
			}

			/**
			 * Sets the value of the custom property.
			 * 
			 * @param value
			 *            allowed object is {@link Boolean }
			 * 
			 */
			public void setCustom(Boolean value) {
				this.custom = value;
			}

			/**
			 * Gets the value of the how property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHow() {
				return how;
			}

			/**
			 * Sets the value of the how property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHow(String value) {
				this.how = value;
			}

			/**
			 * Gets the value of the howuri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHowuri() {
				return howuri;
			}

			/**
			 * Sets the value of the howuri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHowuri(String value) {
				this.howuri = value;
			}

			/**
			 * Gets the value of the why property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getWhy() {
				return why;
			}

			/**
			 * Sets the value of the why property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setWhy(String value) {
				this.why = value;
			}

			/**
			 * Gets the value of the whyuri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getWhyuri() {
				return whyuri;
			}

			/**
			 * Sets the value of the whyuri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setWhyuri(String value) {
				this.whyuri = value;
			}

			/**
			 * Gets the value of the pubconstraint property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the pubconstraint property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getPubconstraint().add(newItem);
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
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the pubconstrainturi property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getPubconstrainturi().add(newItem);
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
			 * Gets a map that contains attributes that aren't bound to any
			 * typed property on this class.
			 * 
			 * <p>
			 * the map is keyed by the name of the attribute and the value is
			 * the string value of the attribute.
			 * 
			 * the map returned by this method is live, and you can add new
			 * attribute by updating the map directly. Because of this design,
			 * there's no setter.
			 * 
			 * 
			 * @return always non-null
			 */
			public Map<QName, String> getOtherAttributes() {
				return otherAttributes;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
		 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}recurrenceRuleAttributes"/>
		 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "")
		@ToString
		public static class RRule {

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
			@XmlAttribute(name = "freq", required = true)
			protected String freq;
			@XmlAttribute(name = "interval")
			@XmlSchemaType(name = "positiveInteger")
			protected BigInteger interval;
			@XmlAttribute(name = "until")
			protected String until;
			@XmlAttribute(name = "count")
			@XmlSchemaType(name = "positiveInteger")
			protected BigInteger count;
			@XmlAttribute(name = "bysecond")
			protected List<Integer> bysecond;
			@XmlAttribute(name = "byminute")
			protected List<Integer> byminute;
			@XmlAttribute(name = "byhour")
			protected List<Integer> byhour;
			@XmlAttribute(name = "byday")
			protected List<String> byday;
			@XmlAttribute(name = "bymonthday")
			protected List<String> bymonthday;
			@XmlAttribute(name = "bymonth")
			protected List<Integer> bymonth;
			@XmlAttribute(name = "byyearday")
			protected List<String> byyearday;
			@XmlAttribute(name = "byweekno")
			protected List<String> byweekno;
			@XmlAttribute(name = "bysetpos")
			protected List<String> bysetpos;
			@XmlAttribute(name = "wkst")
			protected String wkst;
			@XmlAnyAttribute
			private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
			 * Gets the value of the creator property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCreator() {
				return creator;
			}

			/**
			 * Sets the value of the creator property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCreator(String value) {
				this.creator = value;
			}

			/**
			 * Gets the value of the creatoruri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCreatoruri() {
				return creatoruri;
			}

			/**
			 * Sets the value of the creatoruri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCreatoruri(String value) {
				this.creatoruri = value;
			}

			/**
			 * Gets the value of the modified property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModified() {
				return modified;
			}

			/**
			 * Sets the value of the modified property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModified(String value) {
				this.modified = value;
			}

			/**
			 * Gets the value of the custom property.
			 * 
			 * @return possible object is {@link Boolean }
			 * 
			 */
			public Boolean isCustom() {
				return custom;
			}

			/**
			 * Sets the value of the custom property.
			 * 
			 * @param value
			 *            allowed object is {@link Boolean }
			 * 
			 */
			public void setCustom(Boolean value) {
				this.custom = value;
			}

			/**
			 * Gets the value of the how property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHow() {
				return how;
			}

			/**
			 * Sets the value of the how property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHow(String value) {
				this.how = value;
			}

			/**
			 * Gets the value of the howuri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHowuri() {
				return howuri;
			}

			/**
			 * Sets the value of the howuri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHowuri(String value) {
				this.howuri = value;
			}

			/**
			 * Gets the value of the why property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getWhy() {
				return why;
			}

			/**
			 * Sets the value of the why property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setWhy(String value) {
				this.why = value;
			}

			/**
			 * Gets the value of the whyuri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getWhyuri() {
				return whyuri;
			}

			/**
			 * Sets the value of the whyuri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setWhyuri(String value) {
				this.whyuri = value;
			}

			/**
			 * Gets the value of the pubconstraint property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the pubconstraint property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getPubconstraint().add(newItem);
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
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the pubconstrainturi property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getPubconstrainturi().add(newItem);
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
			 * Gets the value of the freq property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getFreq() {
				return freq;
			}

			/**
			 * Sets the value of the freq property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setFreq(String value) {
				this.freq = value;
			}

			/**
			 * Gets the value of the interval property.
			 * 
			 * @return possible object is {@link BigInteger }
			 * 
			 */
			public BigInteger getInterval() {
				return interval;
			}

			/**
			 * Sets the value of the interval property.
			 * 
			 * @param value
			 *            allowed object is {@link BigInteger }
			 * 
			 */
			public void setInterval(BigInteger value) {
				this.interval = value;
			}

			/**
			 * Gets the value of the until property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getUntil() {
				return until;
			}

			/**
			 * Sets the value of the until property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setUntil(String value) {
				this.until = value;
			}

			/**
			 * Gets the value of the count property.
			 * 
			 * @return possible object is {@link BigInteger }
			 * 
			 */
			public BigInteger getCount() {
				return count;
			}

			/**
			 * Sets the value of the count property.
			 * 
			 * @param value
			 *            allowed object is {@link BigInteger }
			 * 
			 */
			public void setCount(BigInteger value) {
				this.count = value;
			}

			/**
			 * Gets the value of the bysecond property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the bysecond property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getBysecond().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link Integer }
			 * 
			 * 
			 */
			public List<Integer> getBysecond() {
				if (bysecond == null) {
					bysecond = new ArrayList<Integer>();
				}
				return this.bysecond;
			}

			/**
			 * Gets the value of the byminute property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the byminute property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getByminute().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link Integer }
			 * 
			 * 
			 */
			public List<Integer> getByminute() {
				if (byminute == null) {
					byminute = new ArrayList<Integer>();
				}
				return this.byminute;
			}

			/**
			 * Gets the value of the byhour property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the byhour property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getByhour().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link Integer }
			 * 
			 * 
			 */
			public List<Integer> getByhour() {
				if (byhour == null) {
					byhour = new ArrayList<Integer>();
				}
				return this.byhour;
			}

			/**
			 * Gets the value of the byday property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the byday property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getByday().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link String }
			 * 
			 * 
			 */
			public List<String> getByday() {
				if (byday == null) {
					byday = new ArrayList<String>();
				}
				return this.byday;
			}

			/**
			 * Gets the value of the bymonthday property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the bymonthday property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getBymonthday().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link String }
			 * 
			 * 
			 */
			public List<String> getBymonthday() {
				if (bymonthday == null) {
					bymonthday = new ArrayList<String>();
				}
				return this.bymonthday;
			}

			/**
			 * Gets the value of the bymonth property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the bymonth property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getBymonth().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link Integer }
			 * 
			 * 
			 */
			public List<Integer> getBymonth() {
				if (bymonth == null) {
					bymonth = new ArrayList<Integer>();
				}
				return this.bymonth;
			}

			/**
			 * Gets the value of the byyearday property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the byyearday property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getByyearday().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link String }
			 * 
			 * 
			 */
			public List<String> getByyearday() {
				if (byyearday == null) {
					byyearday = new ArrayList<String>();
				}
				return this.byyearday;
			}

			/**
			 * Gets the value of the byweekno property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the byweekno property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getByweekno().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link String }
			 * 
			 * 
			 */
			public List<String> getByweekno() {
				if (byweekno == null) {
					byweekno = new ArrayList<String>();
				}
				return this.byweekno;
			}

			/**
			 * Gets the value of the bysetpos property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the bysetpos property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getBysetpos().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list
			 * {@link String }
			 * 
			 * 
			 */
			public List<String> getBysetpos() {
				if (bysetpos == null) {
					bysetpos = new ArrayList<String>();
				}
				return this.bysetpos;
			}

			/**
			 * Gets the value of the wkst property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getWkst() {
				return wkst;
			}

			/**
			 * Sets the value of the wkst property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setWkst(String value) {
				this.wkst = value;
			}

			/**
			 * Gets a map that contains attributes that aren't bound to any
			 * typed property on this class.
			 * 
			 * <p>
			 * the map is keyed by the name of the attribute and the value is
			 * the string value of the attribute.
			 * 
			 * the map returned by this method is live, and you can add new
			 * attribute by updating the map directly. Because of this design,
			 * there's no setter.
			 * 
			 * 
			 * @return always non-null
			 */
			public Map<QName, String> getOtherAttributes() {
				return otherAttributes;
			}

		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}FlexLocationPropType">
	 *       &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
	 *       &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
	 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
	 *     &lt;/extension>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	@ToString
	public static class Location extends FlexLocationPropType {

		@XmlAttribute(name = "role")
		protected String role;
		@XmlAttribute(name = "roleuri")
		protected String roleuri;

		/**
		 * Gets the value of the role property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRole() {
			return role;
		}

		/**
		 * Sets the value of the role property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRole(String value) {
			this.role = value;
		}

		/**
		 * Gets the value of the roleuri property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRoleuri() {
			return roleuri;
		}

		/**
		 * Sets the value of the roleuri property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRoleuri(String value) {
			this.roleuri = value;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="g2contentType" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;simpleContent>
	 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
	 *                 &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
	 *               &lt;/extension>
	 *             &lt;/simpleContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element ref="{http://iptc.org/std/nar/2006-10-01/}itemClass" minOccurs="0"/>
	 *         &lt;element name="assignedTo" type="{http://iptc.org/std/nar/2006-10-01/}Flex1PartyPropType" maxOccurs="unbounded" minOccurs="0"/>
	 *         &lt;element name="scheduled" type="{http://iptc.org/std/nar/2006-10-01/}ApproximateDateTimePropType" minOccurs="0"/>
	 *         &lt;element name="service" type="{http://iptc.org/std/nar/2006-10-01/}QualPropType" maxOccurs="unbounded" minOccurs="0"/>
	 *         &lt;element name="edNote" type="{http://iptc.org/std/nar/2006-10-01/}BlockType" maxOccurs="unbounded" minOccurs="0"/>
	 *         &lt;group ref="{http://iptc.org/std/nar/2006-10-01/}DescriptiveMetadataGroup" minOccurs="0"/>
	 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *       &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
	 *       &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
	 *       &lt;anyAttribute namespace='##other'/>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "g2ContentType", "itemClass", "assignedTo", "scheduled", "service", "edNote",
			"languageOrGenreOrKeyword", "any" })
	@ToString
	public static class NewsCoverage {

		@XmlElement(name = "g2contentType")
		protected EventDetails.NewsCoverage.G2ContentType g2ContentType;
		protected QualPropType itemClass;
		protected List<Flex1PartyPropType> assignedTo;
		protected ApproximateDateTimePropType scheduled;
		protected List<QualPropType> service;
		protected List<BlockType> edNote;
		@XmlElements({ @XmlElement(name = "language", type = Language.class),
				@XmlElement(name = "genre", type = Genre.class), @XmlElement(name = "keyword", type = Keyword.class),
				@XmlElement(name = "subject", type = Subject.class),
				@XmlElement(name = "slugline", type = Slugline.class),
				@XmlElement(name = "headline", type = Headline.class),
				@XmlElement(name = "dateline", type = Dateline.class), @XmlElement(name = "by", type = By.class),
				@XmlElement(name = "creditline", type = Creditline.class),
				@XmlElement(name = "description", type = Description.class) })
		protected List<Object> languageOrGenreOrKeyword;
		@XmlAnyElement(lax = true)
		protected List<Object> any;
		@XmlAttribute(name = "role")
		protected String role;
		@XmlAttribute(name = "roleuri")
		protected String roleuri;
		@XmlAnyAttribute
		private Map<QName, String> otherAttributes = new HashMap<QName, String>();

		/**
		 * Gets the value of the g2ContentType property.
		 * 
		 * @return possible object is
		 *         {@link EventDetails.NewsCoverage.G2ContentType }
		 * 
		 */
		public EventDetails.NewsCoverage.G2ContentType getG2ContentType() {
			return g2ContentType;
		}

		/**
		 * Sets the value of the g2ContentType property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link EventDetails.NewsCoverage.G2ContentType }
		 * 
		 */
		public void setG2ContentType(EventDetails.NewsCoverage.G2ContentType value) {
			this.g2ContentType = value;
		}

		/**
		 * Gets the value of the itemClass property.
		 * 
		 * @return possible object is {@link QualPropType }
		 * 
		 */
		public QualPropType getItemClass() {
			return itemClass;
		}

		/**
		 * Sets the value of the itemClass property.
		 * 
		 * @param value
		 *            allowed object is {@link QualPropType }
		 * 
		 */
		public void setItemClass(QualPropType value) {
			this.itemClass = value;
		}

		/**
		 * Gets the value of the assignedTo property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the assignedTo property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getAssignedTo().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link Flex1PartyPropType }
		 * 
		 * 
		 */
		public List<Flex1PartyPropType> getAssignedTo() {
			if (assignedTo == null) {
				assignedTo = new ArrayList<Flex1PartyPropType>();
			}
			return this.assignedTo;
		}

		/**
		 * Gets the value of the scheduled property.
		 * 
		 * @return possible object is {@link ApproximateDateTimePropType }
		 * 
		 */
		public ApproximateDateTimePropType getScheduled() {
			return scheduled;
		}

		/**
		 * Sets the value of the scheduled property.
		 * 
		 * @param value
		 *            allowed object is {@link ApproximateDateTimePropType }
		 * 
		 */
		public void setScheduled(ApproximateDateTimePropType value) {
			this.scheduled = value;
		}

		/**
		 * Gets the value of the service property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the service property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getService().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link QualPropType }
		 * 
		 * 
		 */
		public List<QualPropType> getService() {
			if (service == null) {
				service = new ArrayList<QualPropType>();
			}
			return this.service;
		}

		/**
		 * Gets the value of the edNote property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the edNote property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getEdNote().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link BlockType }
		 * 
		 * 
		 */
		public List<BlockType> getEdNote() {
			if (edNote == null) {
				edNote = new ArrayList<BlockType>();
			}
			return this.edNote;
		}

		/**
		 * Gets the value of the languageOrGenreOrKeyword property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the languageOrGenreOrKeyword property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getLanguageOrGenreOrKeyword().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link Language } {@link Genre } {@link Keyword } {@link Subject }
		 * {@link Slugline } {@link Headline } {@link Dateline } {@link By }
		 * {@link Creditline } {@link Description }
		 * 
		 * 
		 */
		public List<Object> getLanguageOrGenreOrKeyword() {
			if (languageOrGenreOrKeyword == null) {
				languageOrGenreOrKeyword = new ArrayList<Object>();
			}
			return this.languageOrGenreOrKeyword;
		}

		/**
		 * Gets the value of the any property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the any property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getAny().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link Object } {@link Element }
		 * 
		 * 
		 */
		public List<Object> getAny() {
			if (any == null) {
				any = new ArrayList<Object>();
			}
			return this.any;
		}

		/**
		 * Gets the value of the role property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRole() {
			return role;
		}

		/**
		 * Sets the value of the role property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRole(String value) {
			this.role = value;
		}

		/**
		 * Gets the value of the roleuri property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRoleuri() {
			return roleuri;
		}

		/**
		 * Sets the value of the roleuri property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRoleuri(String value) {
			this.roleuri = value;
		}

		/**
		 * Gets a map that contains attributes that aren't bound to any typed
		 * property on this class.
		 * 
		 * <p>
		 * the map is keyed by the name of the attribute and the value is the
		 * string value of the attribute.
		 * 
		 * the map returned by this method is live, and you can add new
		 * attribute by updating the map directly. Because of this design,
		 * there's no setter.
		 * 
		 * 
		 * @return always non-null
		 */
		public Map<QName, String> getOtherAttributes() {
			return otherAttributes;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;simpleContent>
		 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
		 *       &lt;attGroup ref="{http://iptc.org/std/nar/2006-10-01/}commonPowerAttributes"/>
		 *     &lt;/extension>
		 *   &lt;/simpleContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "value" })
		@ToString
		public static class G2ContentType {

			@XmlValue
			protected String value;
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
			 * Gets the value of the creator property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCreator() {
				return creator;
			}

			/**
			 * Sets the value of the creator property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCreator(String value) {
				this.creator = value;
			}

			/**
			 * Gets the value of the creatoruri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCreatoruri() {
				return creatoruri;
			}

			/**
			 * Sets the value of the creatoruri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCreatoruri(String value) {
				this.creatoruri = value;
			}

			/**
			 * Gets the value of the modified property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getModified() {
				return modified;
			}

			/**
			 * Sets the value of the modified property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setModified(String value) {
				this.modified = value;
			}

			/**
			 * Gets the value of the custom property.
			 * 
			 * @return possible object is {@link Boolean }
			 * 
			 */
			public Boolean isCustom() {
				return custom;
			}

			/**
			 * Sets the value of the custom property.
			 * 
			 * @param value
			 *            allowed object is {@link Boolean }
			 * 
			 */
			public void setCustom(Boolean value) {
				this.custom = value;
			}

			/**
			 * Gets the value of the how property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHow() {
				return how;
			}

			/**
			 * Sets the value of the how property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHow(String value) {
				this.how = value;
			}

			/**
			 * Gets the value of the howuri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getHowuri() {
				return howuri;
			}

			/**
			 * Sets the value of the howuri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setHowuri(String value) {
				this.howuri = value;
			}

			/**
			 * Gets the value of the why property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getWhy() {
				return why;
			}

			/**
			 * Sets the value of the why property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setWhy(String value) {
				this.why = value;
			}

			/**
			 * Gets the value of the whyuri property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getWhyuri() {
				return whyuri;
			}

			/**
			 * Sets the value of the whyuri property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setWhyuri(String value) {
				this.whyuri = value;
			}

			/**
			 * Gets the value of the pubconstraint property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the pubconstraint property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getPubconstraint().add(newItem);
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
			 * This accessor method returns a reference to the live list, not a
			 * snapshot. Therefore any modification you make to the returned
			 * list will be present inside the JAXB object. This is why there is
			 * not a <CODE>set</CODE> method for the pubconstrainturi property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getPubconstrainturi().add(newItem);
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

		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;extension base="{http://iptc.org/std/nar/2006-10-01/}Flex1PropType">
	 *       &lt;attribute name="role" type="{http://iptc.org/std/nar/2006-10-01/}QCodeType" />
	 *       &lt;attribute name="roleuri" type="{http://iptc.org/std/nar/2006-10-01/}IRIType" />
	 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
	 *     &lt;/extension>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "")
	@ToString
	public static class ParticipationRequirement extends Flex1PropType {

		@XmlAttribute(name = "role")
		protected String role;
		@XmlAttribute(name = "roleuri")
		protected String roleuri;

		/**
		 * Gets the value of the role property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRole() {
			return role;
		}

		/**
		 * Sets the value of the role property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRole(String value) {
			this.role = value;
		}

		/**
		 * Gets the value of the roleuri property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRoleuri() {
			return roleuri;
		}

		/**
		 * Sets the value of the roleuri property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setRoleuri(String value) {
			this.roleuri = value;
		}

	}

}
