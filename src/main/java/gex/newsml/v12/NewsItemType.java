
package gex.newsml.v12;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * A managed set of information representing a point of view, at a given time, on some event or events. Its Identification and NewsManagement provide manageability. It may contain either a NewsComponent, or one or more Updates that modify aspects of a previous Revision of the same NewsItem, or a TopicSet. 
 * 
 * <p>Java class for NewsItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewsItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
 *         &lt;element name="Identification">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NewsIdentifier">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProviderId">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="Vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DateId" type="{http://iptc.org/std/NewsML/2003-10-10/}NewsMLDate"/>
 *                             &lt;element name="NewsItemId">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="Vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RevisionId">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
 *                                     &lt;attribute name="PreviousRevision" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
 *                                     &lt;attribute name="Update" type="{http://iptc.org/std/NewsML/2003-10-10/}updateType" default="N" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PublicIdentifier">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="27"/>
 *                                   &lt;pattern value="urn:newsml:\D+:(19[0-9][0-9]|20[0-9][0-9]|21[0-9][0-9])(0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1]):.+:\d+\D?"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="NameLabel" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DateLabel" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Label" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LabelType">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LabelText">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NewsManagement">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NewsItemType">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FirstCreated">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://iptc.org/std/NewsML/2003-10-10/>NewsMLDateTime">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ThisRevisionCreated">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://iptc.org/std/NewsML/2003-10-10/>NewsMLDateTime">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Status" type="{http://iptc.org/std/NewsML/2003-10-10/}StatusType"/>
 *                   &lt;element name="StatusWillChange" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FutureStatus">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DateAndTime" type="{http://iptc.org/std/NewsML/2003-10-10/}DateAndTimeType"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Urgency" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RevisionHistory" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attribute name="Href" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DerivedFrom" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attribute name="FormalName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="NewsItem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AssociatedWith" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attribute name="FormalName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="NewsItem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Instruction" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RevisionStatus" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Status" type="{http://iptc.org/std/NewsML/2003-10-10/}StatusType"/>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                                     &lt;attribute name="Revision" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="NewsComponent" type="{http://iptc.org/std/NewsML/2003-10-10/}NewsComponentType"/>
 *           &lt;element name="Update" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="InsertBefore">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                             &lt;attribute name="DuidRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="InsertAfter">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                             &lt;attribute name="DuidRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Replace">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                             &lt;attribute name="DuidRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Delete">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                             &lt;attribute name="DuidRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="TopicSet" type="{http://iptc.org/std/NewsML/2003-10-10/}TopicSetType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewsItemType", propOrder = {
    "comment",
    "catalog",
    "identification",
    "newsManagement",
    "newsComponent",
    "update",
    "topicSet"
})
public class NewsItemType {

    @XmlElement(name = "Comment")
    protected List<CommentType> comment;
    @XmlElement(name = "Catalog")
    protected CatalogType catalog;
    @XmlElement(name = "Identification", required = true)
    protected NewsItemType.Identification identification;
    @XmlElement(name = "NewsManagement", required = true)
    protected NewsItemType.NewsManagement newsManagement;
    @XmlElement(name = "NewsComponent")
    protected NewsComponentType newsComponent;
    @XmlElement(name = "Update")
    protected List<NewsItemType.Update> update;
    @XmlElement(name = "TopicSet")
    protected TopicSetType topicSet;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;
    @XmlAttribute(name = "Duid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String duid;
    @XmlAttribute(name = "Euid")
    protected String euid;

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType }
     * 
     * 
     */
    public List<CommentType> getComment() {
        if (comment == null) {
            comment = new ArrayList<CommentType>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the catalog property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogType }
     *     
     */
    public CatalogType getCatalog() {
        return catalog;
    }

    /**
     * Sets the value of the catalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogType }
     *     
     */
    public void setCatalog(CatalogType value) {
        this.catalog = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link NewsItemType.Identification }
     *     
     */
    public NewsItemType.Identification getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewsItemType.Identification }
     *     
     */
    public void setIdentification(NewsItemType.Identification value) {
        this.identification = value;
    }

    /**
     * Gets the value of the newsManagement property.
     * 
     * @return
     *     possible object is
     *     {@link NewsItemType.NewsManagement }
     *     
     */
    public NewsItemType.NewsManagement getNewsManagement() {
        return newsManagement;
    }

    /**
     * Sets the value of the newsManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewsItemType.NewsManagement }
     *     
     */
    public void setNewsManagement(NewsItemType.NewsManagement value) {
        this.newsManagement = value;
    }

    /**
     * Gets the value of the newsComponent property.
     * 
     * @return
     *     possible object is
     *     {@link NewsComponentType }
     *     
     */
    public NewsComponentType getNewsComponent() {
        return newsComponent;
    }

    /**
     * Sets the value of the newsComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewsComponentType }
     *     
     */
    public void setNewsComponent(NewsComponentType value) {
        this.newsComponent = value;
    }

    /**
     * Gets the value of the update property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the update property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewsItemType.Update }
     * 
     * 
     */
    public List<NewsItemType.Update> getUpdate() {
        if (update == null) {
            update = new ArrayList<NewsItemType.Update>();
        }
        return this.update;
    }

    /**
     * Gets the value of the topicSet property.
     * 
     * @return
     *     possible object is
     *     {@link TopicSetType }
     *     
     */
    public TopicSetType getTopicSet() {
        return topicSet;
    }

    /**
     * Sets the value of the topicSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopicSetType }
     *     
     */
    public void setTopicSet(TopicSetType value) {
        this.topicSet = value;
    }

    /**
     * Gets the value of the lang property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="NewsIdentifier">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ProviderId">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="Vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DateId" type="{http://iptc.org/std/NewsML/2003-10-10/}NewsMLDate"/>
     *                   &lt;element name="NewsItemId">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="Vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RevisionId">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
     *                           &lt;attribute name="PreviousRevision" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
     *                           &lt;attribute name="Update" type="{http://iptc.org/std/NewsML/2003-10-10/}updateType" default="N" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PublicIdentifier">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="27"/>
     *                         &lt;pattern value="urn:newsml:\D+:(19[0-9][0-9]|20[0-9][0-9]|21[0-9][0-9])(0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1]):.+:\d+\D?"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="NameLabel" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DateLabel" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Label" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LabelType">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
     *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="LabelText">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "newsIdentifier",
        "nameLabel",
        "dateLabel",
        "label"
    })
    public static class Identification {

        @XmlElement(name = "NewsIdentifier", required = true)
        protected NewsItemType.Identification.NewsIdentifier newsIdentifier;
        @XmlElement(name = "NameLabel")
        protected NewsItemType.Identification.NameLabel nameLabel;
        @XmlElement(name = "DateLabel")
        protected NewsItemType.Identification.DateLabel dateLabel;
        @XmlElement(name = "Label")
        protected List<NewsItemType.Identification.Label> label;
        @XmlAttribute(name = "Duid")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String duid;
        @XmlAttribute(name = "Euid")
        protected String euid;

        /**
         * Gets the value of the newsIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link NewsItemType.Identification.NewsIdentifier }
         *     
         */
        public NewsItemType.Identification.NewsIdentifier getNewsIdentifier() {
            return newsIdentifier;
        }

        /**
         * Sets the value of the newsIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewsItemType.Identification.NewsIdentifier }
         *     
         */
        public void setNewsIdentifier(NewsItemType.Identification.NewsIdentifier value) {
            this.newsIdentifier = value;
        }

        /**
         * Gets the value of the nameLabel property.
         * 
         * @return
         *     possible object is
         *     {@link NewsItemType.Identification.NameLabel }
         *     
         */
        public NewsItemType.Identification.NameLabel getNameLabel() {
            return nameLabel;
        }

        /**
         * Sets the value of the nameLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewsItemType.Identification.NameLabel }
         *     
         */
        public void setNameLabel(NewsItemType.Identification.NameLabel value) {
            this.nameLabel = value;
        }

        /**
         * Gets the value of the dateLabel property.
         * 
         * @return
         *     possible object is
         *     {@link NewsItemType.Identification.DateLabel }
         *     
         */
        public NewsItemType.Identification.DateLabel getDateLabel() {
            return dateLabel;
        }

        /**
         * Sets the value of the dateLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewsItemType.Identification.DateLabel }
         *     
         */
        public void setDateLabel(NewsItemType.Identification.DateLabel value) {
            this.dateLabel = value;
        }

        /**
         * Gets the value of the label property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the label property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLabel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NewsItemType.Identification.Label }
         * 
         * 
         */
        public List<NewsItemType.Identification.Label> getLabel() {
            if (label == null) {
                label = new ArrayList<NewsItemType.Identification.Label>();
            }
            return this.label;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DateLabel {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

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

        }


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
         *         &lt;element name="LabelType">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
         *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="LabelText">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "labelType",
            "labelText"
        })
        public static class Label {

            @XmlElement(name = "LabelType", required = true)
            protected NewsItemType.Identification.Label.LabelType labelType;
            @XmlElement(name = "LabelText", required = true)
            protected NewsItemType.Identification.Label.LabelText labelText;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

            /**
             * Gets the value of the labelType property.
             * 
             * @return
             *     possible object is
             *     {@link NewsItemType.Identification.Label.LabelType }
             *     
             */
            public NewsItemType.Identification.Label.LabelType getLabelType() {
                return labelType;
            }

            /**
             * Sets the value of the labelType property.
             * 
             * @param value
             *     allowed object is
             *     {@link NewsItemType.Identification.Label.LabelType }
             *     
             */
            public void setLabelType(NewsItemType.Identification.Label.LabelType value) {
                this.labelType = value;
            }

            /**
             * Gets the value of the labelText property.
             * 
             * @return
             *     possible object is
             *     {@link NewsItemType.Identification.Label.LabelText }
             *     
             */
            public NewsItemType.Identification.Label.LabelText getLabelText() {
                return labelText;
            }

            /**
             * Sets the value of the labelText property.
             * 
             * @param value
             *     allowed object is
             *     {@link NewsItemType.Identification.Label.LabelText }
             *     
             */
            public void setLabelText(NewsItemType.Identification.Label.LabelText value) {
                this.labelText = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class LabelText {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Duid")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlID
                @XmlSchemaType(name = "ID")
                protected String duid;
                @XmlAttribute(name = "Euid")
                protected String euid;

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

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
             *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LabelType {

                @XmlAttribute(name = "FormalName", required = true)
                protected String formalName;
                @XmlAttribute(name = "Vocabulary")
                protected String vocabulary;
                @XmlAttribute(name = "Scheme")
                protected String scheme;
                @XmlAttribute(name = "Duid")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlID
                @XmlSchemaType(name = "ID")
                protected String duid;
                @XmlAttribute(name = "Euid")
                protected String euid;

                /**
                 * Gets the value of the formalName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFormalName() {
                    return formalName;
                }

                /**
                 * Sets the value of the formalName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFormalName(String value) {
                    this.formalName = value;
                }

                /**
                 * Gets the value of the vocabulary property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVocabulary() {
                    return vocabulary;
                }

                /**
                 * Sets the value of the vocabulary property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVocabulary(String value) {
                    this.vocabulary = value;
                }

                /**
                 * Gets the value of the scheme property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getScheme() {
                    return scheme;
                }

                /**
                 * Sets the value of the scheme property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setScheme(String value) {
                    this.scheme = value;
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

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class NameLabel {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

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

        }


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
         *         &lt;element name="ProviderId">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="Vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DateId" type="{http://iptc.org/std/NewsML/2003-10-10/}NewsMLDate"/>
         *         &lt;element name="NewsItemId">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="Vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RevisionId">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
         *                 &lt;attribute name="PreviousRevision" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
         *                 &lt;attribute name="Update" type="{http://iptc.org/std/NewsML/2003-10-10/}updateType" default="N" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PublicIdentifier">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="27"/>
         *               &lt;pattern value="urn:newsml:\D+:(19[0-9][0-9]|20[0-9][0-9]|21[0-9][0-9])(0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1]):.+:\d+\D?"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
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
            "providerId",
            "dateId",
            "newsItemId",
            "revisionId",
            "publicIdentifier"
        })
        public static class NewsIdentifier {

            @XmlElement(name = "ProviderId", required = true)
            protected NewsItemType.Identification.NewsIdentifier.ProviderId providerId;
            @XmlElement(name = "DateId", required = true)
            protected String dateId;
            @XmlElement(name = "NewsItemId", required = true)
            protected NewsItemType.Identification.NewsIdentifier.NewsItemId newsItemId;
            @XmlElement(name = "RevisionId", required = true, defaultValue = "1")
            protected NewsItemType.Identification.NewsIdentifier.RevisionId revisionId;
            @XmlElement(name = "PublicIdentifier", required = true)
            protected String publicIdentifier;

            /**
             * Gets the value of the providerId property.
             * 
             * @return
             *     possible object is
             *     {@link NewsItemType.Identification.NewsIdentifier.ProviderId }
             *     
             */
            public NewsItemType.Identification.NewsIdentifier.ProviderId getProviderId() {
                return providerId;
            }

            /**
             * Sets the value of the providerId property.
             * 
             * @param value
             *     allowed object is
             *     {@link NewsItemType.Identification.NewsIdentifier.ProviderId }
             *     
             */
            public void setProviderId(NewsItemType.Identification.NewsIdentifier.ProviderId value) {
                this.providerId = value;
            }

            /**
             * Gets the value of the dateId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateId() {
                return dateId;
            }

            /**
             * Sets the value of the dateId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateId(String value) {
                this.dateId = value;
            }

            /**
             * Gets the value of the newsItemId property.
             * 
             * @return
             *     possible object is
             *     {@link NewsItemType.Identification.NewsIdentifier.NewsItemId }
             *     
             */
            public NewsItemType.Identification.NewsIdentifier.NewsItemId getNewsItemId() {
                return newsItemId;
            }

            /**
             * Sets the value of the newsItemId property.
             * 
             * @param value
             *     allowed object is
             *     {@link NewsItemType.Identification.NewsIdentifier.NewsItemId }
             *     
             */
            public void setNewsItemId(NewsItemType.Identification.NewsIdentifier.NewsItemId value) {
                this.newsItemId = value;
            }

            /**
             * Gets the value of the revisionId property.
             * 
             * @return
             *     possible object is
             *     {@link NewsItemType.Identification.NewsIdentifier.RevisionId }
             *     
             */
            public NewsItemType.Identification.NewsIdentifier.RevisionId getRevisionId() {
                return revisionId;
            }

            /**
             * Sets the value of the revisionId property.
             * 
             * @param value
             *     allowed object is
             *     {@link NewsItemType.Identification.NewsIdentifier.RevisionId }
             *     
             */
            public void setRevisionId(NewsItemType.Identification.NewsIdentifier.RevisionId value) {
                this.revisionId = value;
            }

            /**
             * Gets the value of the publicIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPublicIdentifier() {
                return publicIdentifier;
            }

            /**
             * Sets the value of the publicIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPublicIdentifier(String value) {
                this.publicIdentifier = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="Vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class NewsItemId {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Vocabulary")
                protected String vocabulary;
                @XmlAttribute(name = "Scheme")
                protected String scheme;

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
                 * Gets the value of the vocabulary property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVocabulary() {
                    return vocabulary;
                }

                /**
                 * Sets the value of the vocabulary property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVocabulary(String value) {
                    this.vocabulary = value;
                }

                /**
                 * Gets the value of the scheme property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getScheme() {
                    return scheme;
                }

                /**
                 * Sets the value of the scheme property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setScheme(String value) {
                    this.scheme = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="Vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class ProviderId {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Vocabulary")
                protected String vocabulary;

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
                 * Gets the value of the vocabulary property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVocabulary() {
                    return vocabulary;
                }

                /**
                 * Sets the value of the vocabulary property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVocabulary(String value) {
                    this.vocabulary = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
             *       &lt;attribute name="PreviousRevision" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="0" />
             *       &lt;attribute name="Update" type="{http://iptc.org/std/NewsML/2003-10-10/}updateType" default="N" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class RevisionId {

                @XmlValue
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger value;
                @XmlAttribute(name = "PreviousRevision")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger previousRevision;
                @XmlAttribute(name = "Update")
                protected UpdateType update;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setValue(BigInteger value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the previousRevision property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getPreviousRevision() {
                    if (previousRevision == null) {
                        return new BigInteger("0");
                    } else {
                        return previousRevision;
                    }
                }

                /**
                 * Sets the value of the previousRevision property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPreviousRevision(BigInteger value) {
                    this.previousRevision = value;
                }

                /**
                 * Gets the value of the update property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UpdateType }
                 *     
                 */
                public UpdateType getUpdate() {
                    if (update == null) {
                        return UpdateType.N;
                    } else {
                        return update;
                    }
                }

                /**
                 * Sets the value of the update property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UpdateType }
                 *     
                 */
                public void setUpdate(UpdateType value) {
                    this.update = value;
                }

            }

        }

    }


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
     *         &lt;element name="NewsItemType">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FirstCreated">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://iptc.org/std/NewsML/2003-10-10/>NewsMLDateTime">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ThisRevisionCreated">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://iptc.org/std/NewsML/2003-10-10/>NewsMLDateTime">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Status" type="{http://iptc.org/std/NewsML/2003-10-10/}StatusType"/>
     *         &lt;element name="StatusWillChange" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FutureStatus">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DateAndTime" type="{http://iptc.org/std/NewsML/2003-10-10/}DateAndTimeType"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Urgency" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RevisionHistory" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                 &lt;attribute name="Href" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DerivedFrom" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                 &lt;attribute name="FormalName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="NewsItem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AssociatedWith" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                 &lt;attribute name="FormalName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="NewsItem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Instruction" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RevisionStatus" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Status" type="{http://iptc.org/std/NewsML/2003-10-10/}StatusType"/>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                           &lt;attribute name="Revision" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "newsItemType",
        "firstCreated",
        "thisRevisionCreated",
        "status",
        "statusWillChange",
        "urgency",
        "revisionHistory",
        "derivedFrom",
        "associatedWith",
        "instruction",
        "property"
    })
    public static class NewsManagement {

        @XmlElement(name = "NewsItemType", required = true)
        protected NewsItemType.NewsManagement.Type newsItemType;
        @XmlElement(name = "FirstCreated", required = true)
        protected NewsItemType.NewsManagement.FirstCreated firstCreated;
        @XmlElement(name = "ThisRevisionCreated", required = true)
        protected NewsItemType.NewsManagement.ThisRevisionCreated thisRevisionCreated;
        @XmlElement(name = "Status", required = true)
        protected StatusType status;
        @XmlElement(name = "StatusWillChange")
        protected List<NewsItemType.NewsManagement.StatusWillChange> statusWillChange;
        @XmlElement(name = "Urgency")
        protected NewsItemType.NewsManagement.Urgency urgency;
        @XmlElement(name = "RevisionHistory")
        protected NewsItemType.NewsManagement.RevisionHistory revisionHistory;
        @XmlElement(name = "DerivedFrom")
        protected List<NewsItemType.NewsManagement.DerivedFrom> derivedFrom;
        @XmlElement(name = "AssociatedWith")
        protected List<NewsItemType.NewsManagement.AssociatedWith> associatedWith;
        @XmlElement(name = "Instruction")
        protected List<NewsItemType.NewsManagement.Instruction> instruction;
        @XmlElement(name = "Property")
        protected List<PropertyType> property;
        @XmlAttribute(name = "Duid")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String duid;
        @XmlAttribute(name = "Euid")
        protected String euid;

        /**
         * Gets the value of the newsItemType property.
         * 
         * @return
         *     possible object is
         *     {@link NewsItemType.NewsManagement.Type }
         *     
         */
        public NewsItemType.NewsManagement.Type getNewsItemType() {
            return newsItemType;
        }

        /**
         * Sets the value of the newsItemType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewsItemType.NewsManagement.Type }
         *     
         */
        public void setNewsItemType(NewsItemType.NewsManagement.Type value) {
            this.newsItemType = value;
        }

        /**
         * Gets the value of the firstCreated property.
         * 
         * @return
         *     possible object is
         *     {@link NewsItemType.NewsManagement.FirstCreated }
         *     
         */
        public NewsItemType.NewsManagement.FirstCreated getFirstCreated() {
            return firstCreated;
        }

        /**
         * Sets the value of the firstCreated property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewsItemType.NewsManagement.FirstCreated }
         *     
         */
        public void setFirstCreated(NewsItemType.NewsManagement.FirstCreated value) {
            this.firstCreated = value;
        }

        /**
         * Gets the value of the thisRevisionCreated property.
         * 
         * @return
         *     possible object is
         *     {@link NewsItemType.NewsManagement.ThisRevisionCreated }
         *     
         */
        public NewsItemType.NewsManagement.ThisRevisionCreated getThisRevisionCreated() {
            return thisRevisionCreated;
        }

        /**
         * Sets the value of the thisRevisionCreated property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewsItemType.NewsManagement.ThisRevisionCreated }
         *     
         */
        public void setThisRevisionCreated(NewsItemType.NewsManagement.ThisRevisionCreated value) {
            this.thisRevisionCreated = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link StatusType }
         *     
         */
        public StatusType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType }
         *     
         */
        public void setStatus(StatusType value) {
            this.status = value;
        }

        /**
         * Gets the value of the statusWillChange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statusWillChange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatusWillChange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NewsItemType.NewsManagement.StatusWillChange }
         * 
         * 
         */
        public List<NewsItemType.NewsManagement.StatusWillChange> getStatusWillChange() {
            if (statusWillChange == null) {
                statusWillChange = new ArrayList<NewsItemType.NewsManagement.StatusWillChange>();
            }
            return this.statusWillChange;
        }

        /**
         * Gets the value of the urgency property.
         * 
         * @return
         *     possible object is
         *     {@link NewsItemType.NewsManagement.Urgency }
         *     
         */
        public NewsItemType.NewsManagement.Urgency getUrgency() {
            return urgency;
        }

        /**
         * Sets the value of the urgency property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewsItemType.NewsManagement.Urgency }
         *     
         */
        public void setUrgency(NewsItemType.NewsManagement.Urgency value) {
            this.urgency = value;
        }

        /**
         * Gets the value of the revisionHistory property.
         * 
         * @return
         *     possible object is
         *     {@link NewsItemType.NewsManagement.RevisionHistory }
         *     
         */
        public NewsItemType.NewsManagement.RevisionHistory getRevisionHistory() {
            return revisionHistory;
        }

        /**
         * Sets the value of the revisionHistory property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewsItemType.NewsManagement.RevisionHistory }
         *     
         */
        public void setRevisionHistory(NewsItemType.NewsManagement.RevisionHistory value) {
            this.revisionHistory = value;
        }

        /**
         * Gets the value of the derivedFrom property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the derivedFrom property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDerivedFrom().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NewsItemType.NewsManagement.DerivedFrom }
         * 
         * 
         */
        public List<NewsItemType.NewsManagement.DerivedFrom> getDerivedFrom() {
            if (derivedFrom == null) {
                derivedFrom = new ArrayList<NewsItemType.NewsManagement.DerivedFrom>();
            }
            return this.derivedFrom;
        }

        /**
         * Gets the value of the associatedWith property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associatedWith property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssociatedWith().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NewsItemType.NewsManagement.AssociatedWith }
         * 
         * 
         */
        public List<NewsItemType.NewsManagement.AssociatedWith> getAssociatedWith() {
            if (associatedWith == null) {
                associatedWith = new ArrayList<NewsItemType.NewsManagement.AssociatedWith>();
            }
            return this.associatedWith;
        }

        /**
         * Gets the value of the instruction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the instruction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInstruction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NewsItemType.NewsManagement.Instruction }
         * 
         * 
         */
        public List<NewsItemType.NewsManagement.Instruction> getInstruction() {
            if (instruction == null) {
                instruction = new ArrayList<NewsItemType.NewsManagement.Instruction>();
            }
            return this.instruction;
        }

        /**
         * Gets the value of the property property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the property property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProperty().add(newItem);
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *       &lt;attribute name="FormalName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="NewsItem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "comment"
        })
        public static class AssociatedWith {

            @XmlElement(name = "Comment")
            protected List<CommentType> comment;
            @XmlAttribute(name = "FormalName")
            protected String formalName;
            @XmlAttribute(name = "Vocabulary")
            protected String vocabulary;
            @XmlAttribute(name = "Scheme")
            protected String scheme;
            @XmlAttribute(name = "NewsItem")
            protected String newsItem;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

            /**
             * Gets the value of the comment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the comment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getComment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CommentType }
             * 
             * 
             */
            public List<CommentType> getComment() {
                if (comment == null) {
                    comment = new ArrayList<CommentType>();
                }
                return this.comment;
            }

            /**
             * Gets the value of the formalName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormalName() {
                return formalName;
            }

            /**
             * Sets the value of the formalName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormalName(String value) {
                this.formalName = value;
            }

            /**
             * Gets the value of the vocabulary property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVocabulary() {
                return vocabulary;
            }

            /**
             * Sets the value of the vocabulary property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVocabulary(String value) {
                this.vocabulary = value;
            }

            /**
             * Gets the value of the scheme property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScheme() {
                return scheme;
            }

            /**
             * Sets the value of the scheme property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScheme(String value) {
                this.scheme = value;
            }

            /**
             * Gets the value of the newsItem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewsItem() {
                return newsItem;
            }

            /**
             * Sets the value of the newsItem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewsItem(String value) {
                this.newsItem = value;
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

        }


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
         *         &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *       &lt;attribute name="FormalName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="NewsItem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "comment"
        })
        public static class DerivedFrom {

            @XmlElement(name = "Comment")
            protected List<CommentType> comment;
            @XmlAttribute(name = "FormalName")
            protected String formalName;
            @XmlAttribute(name = "Vocabulary")
            protected String vocabulary;
            @XmlAttribute(name = "Scheme")
            protected String scheme;
            @XmlAttribute(name = "NewsItem")
            protected String newsItem;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

            /**
             * Gets the value of the comment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the comment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getComment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CommentType }
             * 
             * 
             */
            public List<CommentType> getComment() {
                if (comment == null) {
                    comment = new ArrayList<CommentType>();
                }
                return this.comment;
            }

            /**
             * Gets the value of the formalName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormalName() {
                return formalName;
            }

            /**
             * Sets the value of the formalName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormalName(String value) {
                this.formalName = value;
            }

            /**
             * Gets the value of the vocabulary property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVocabulary() {
                return vocabulary;
            }

            /**
             * Sets the value of the vocabulary property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVocabulary(String value) {
                this.vocabulary = value;
            }

            /**
             * Gets the value of the scheme property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScheme() {
                return scheme;
            }

            /**
             * Sets the value of the scheme property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScheme(String value) {
                this.scheme = value;
            }

            /**
             * Gets the value of the newsItem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewsItem() {
                return newsItem;
            }

            /**
             * Sets the value of the newsItem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewsItem(String value) {
                this.newsItem = value;
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

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://iptc.org/std/NewsML/2003-10-10/>NewsMLDateTime">
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class FirstCreated {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

            /**
             *  The date and (optionally) time at which a piece of metadata was assigned. 
             * 				Uses the format YYYYMMDDTHHMMSS{+or-}HHMM (year, month, day, time separator, hours, minutes, seconds, timezone separator, hours, minutes). If only the Date is needed, then the substring from T onwards may be omitted. Where the offset difference is +0000 the letter suffix "Z" may alternatively be used. 
             * 				This is the Basic Format defined by ISO 8601.  YYYY is a 4-digit year number. MM is a 2-digit month number. DD is a 2-digit day number. T is the letter 'T'. HH is a 2-digit hour number (using a 24-hour clock). MM is a 2 digit minute number. (Note that midnight may be represented as 240000 on the date of the day that is ending, or as 000000 on the date of the day that is beginning.) 
             * 				{+or-} is the '+' character or the '-' character, and the following HHMM are hours and minutes of offset from Universal Co-ordinated Time (UTC) as defined by ISO 8601. If the time is being expressed in UTC, then the timezone offset may be '+0000' or '-0000'. If the time is behind UTC, the timezone separator is '-'. If the time is ahead of UTC the timezone separator is '+'.
             * 				Example: 10:27 p.m. in New York on 31 December 2000 would be expressed as "20001231T222700-0500" as New York is five hours behind UTC in winter. At the same moment in London, the date and time would be expressed as "20010101T032700+0000" or as "20010101T032700-0000" because in London it is now 3:27 a.m. on 1 January 2001. At the same moment in Paris,the date and time would be expressed as "20010101T042700+0100", because Paris is one hour ahead of UTC in winter and it is now 4:27 a.m. on 1 January 2001
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

        }


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
         *         &lt;element name="RevisionStatus" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Status" type="{http://iptc.org/std/NewsML/2003-10-10/}StatusType"/>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *                 &lt;attribute name="Revision" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "revisionStatus"
        })
        public static class Instruction {

            @XmlElement(name = "RevisionStatus")
            protected List<NewsItemType.NewsManagement.Instruction.RevisionStatus> revisionStatus;
            @XmlAttribute(name = "FormalName", required = true)
            protected String formalName;
            @XmlAttribute(name = "Vocabulary")
            protected String vocabulary;
            @XmlAttribute(name = "Scheme")
            protected String scheme;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

            /**
             * Gets the value of the revisionStatus property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the revisionStatus property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRevisionStatus().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NewsItemType.NewsManagement.Instruction.RevisionStatus }
             * 
             * 
             */
            public List<NewsItemType.NewsManagement.Instruction.RevisionStatus> getRevisionStatus() {
                if (revisionStatus == null) {
                    revisionStatus = new ArrayList<NewsItemType.NewsManagement.Instruction.RevisionStatus>();
                }
                return this.revisionStatus;
            }

            /**
             * Gets the value of the formalName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormalName() {
                return formalName;
            }

            /**
             * Sets the value of the formalName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormalName(String value) {
                this.formalName = value;
            }

            /**
             * Gets the value of the vocabulary property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVocabulary() {
                return vocabulary;
            }

            /**
             * Sets the value of the vocabulary property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVocabulary(String value) {
                this.vocabulary = value;
            }

            /**
             * Gets the value of the scheme property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScheme() {
                return scheme;
            }

            /**
             * Sets the value of the scheme property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScheme(String value) {
                this.scheme = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Status" type="{http://iptc.org/std/NewsML/2003-10-10/}StatusType"/>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
             *       &lt;attribute name="Revision" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "status"
            })
            public static class RevisionStatus {

                @XmlElement(name = "Status", required = true)
                protected StatusType status;
                @XmlAttribute(name = "Revision")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger revision;
                @XmlAttribute(name = "Duid")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlID
                @XmlSchemaType(name = "ID")
                protected String duid;
                @XmlAttribute(name = "Euid")
                protected String euid;

                /**
                 * Gets the value of the status property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType }
                 *     
                 */
                public StatusType getStatus() {
                    return status;
                }

                /**
                 * Sets the value of the status property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType }
                 *     
                 */
                public void setStatus(StatusType value) {
                    this.status = value;
                }

                /**
                 * Gets the value of the revision property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getRevision() {
                    return revision;
                }

                /**
                 * Sets the value of the revision property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setRevision(BigInteger value) {
                    this.revision = value;
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

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Type {

            @XmlAttribute(name = "FormalName", required = true)
            protected String formalName;
            @XmlAttribute(name = "Vocabulary")
            protected String vocabulary;
            @XmlAttribute(name = "Scheme")
            protected String scheme;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

            /**
             * Gets the value of the formalName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormalName() {
                return formalName;
            }

            /**
             * Sets the value of the formalName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormalName(String value) {
                this.formalName = value;
            }

            /**
             * Gets the value of the vocabulary property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVocabulary() {
                return vocabulary;
            }

            /**
             * Sets the value of the vocabulary property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVocabulary(String value) {
                this.vocabulary = value;
            }

            /**
             * Gets the value of the scheme property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScheme() {
                return scheme;
            }

            /**
             * Sets the value of the scheme property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScheme(String value) {
                this.scheme = value;
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

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *       &lt;attribute name="Href" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RevisionHistory {

            @XmlAttribute(name = "Href", required = true)
            protected String href;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

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

        }


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
         *         &lt;element name="FutureStatus">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DateAndTime" type="{http://iptc.org/std/NewsML/2003-10-10/}DateAndTimeType"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "futureStatus",
            "dateAndTime"
        })
        public static class StatusWillChange {

            @XmlElement(name = "FutureStatus", required = true)
            protected NewsItemType.NewsManagement.StatusWillChange.FutureStatus futureStatus;
            @XmlElement(name = "DateAndTime", required = true)
            protected DateAndTimeType dateAndTime;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

            /**
             * Gets the value of the futureStatus property.
             * 
             * @return
             *     possible object is
             *     {@link NewsItemType.NewsManagement.StatusWillChange.FutureStatus }
             *     
             */
            public NewsItemType.NewsManagement.StatusWillChange.FutureStatus getFutureStatus() {
                return futureStatus;
            }

            /**
             * Sets the value of the futureStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link NewsItemType.NewsManagement.StatusWillChange.FutureStatus }
             *     
             */
            public void setFutureStatus(NewsItemType.NewsManagement.StatusWillChange.FutureStatus value) {
                this.futureStatus = value;
            }

            /**
             * Gets the value of the dateAndTime property.
             * 
             * @return
             *     possible object is
             *     {@link DateAndTimeType }
             *     
             */
            public DateAndTimeType getDateAndTime() {
                return dateAndTime;
            }

            /**
             * Sets the value of the dateAndTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateAndTimeType }
             *     
             */
            public void setDateAndTime(DateAndTimeType value) {
                this.dateAndTime = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
             *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FutureStatus {

                @XmlAttribute(name = "Duid")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlID
                @XmlSchemaType(name = "ID")
                protected String duid;
                @XmlAttribute(name = "Euid")
                protected String euid;
                @XmlAttribute(name = "FormalName", required = true)
                protected String formalName;
                @XmlAttribute(name = "Vocabulary")
                protected String vocabulary;
                @XmlAttribute(name = "Scheme")
                protected String scheme;

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
                 * Gets the value of the formalName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFormalName() {
                    return formalName;
                }

                /**
                 * Sets the value of the formalName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFormalName(String value) {
                    this.formalName = value;
                }

                /**
                 * Gets the value of the vocabulary property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVocabulary() {
                    return vocabulary;
                }

                /**
                 * Sets the value of the vocabulary property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVocabulary(String value) {
                    this.vocabulary = value;
                }

                /**
                 * Gets the value of the scheme property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getScheme() {
                    return scheme;
                }

                /**
                 * Sets the value of the scheme property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setScheme(String value) {
                    this.scheme = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://iptc.org/std/NewsML/2003-10-10/>NewsMLDateTime">
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ThisRevisionCreated {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

            /**
             *  The date and (optionally) time at which a piece of metadata was assigned. 
             * 				Uses the format YYYYMMDDTHHMMSS{+or-}HHMM (year, month, day, time separator, hours, minutes, seconds, timezone separator, hours, minutes). If only the Date is needed, then the substring from T onwards may be omitted. Where the offset difference is +0000 the letter suffix "Z" may alternatively be used. 
             * 				This is the Basic Format defined by ISO 8601.  YYYY is a 4-digit year number. MM is a 2-digit month number. DD is a 2-digit day number. T is the letter 'T'. HH is a 2-digit hour number (using a 24-hour clock). MM is a 2 digit minute number. (Note that midnight may be represented as 240000 on the date of the day that is ending, or as 000000 on the date of the day that is beginning.) 
             * 				{+or-} is the '+' character or the '-' character, and the following HHMM are hours and minutes of offset from Universal Co-ordinated Time (UTC) as defined by ISO 8601. If the time is being expressed in UTC, then the timezone offset may be '+0000' or '-0000'. If the time is behind UTC, the timezone separator is '-'. If the time is ahead of UTC the timezone separator is '+'.
             * 				Example: 10:27 p.m. in New York on 31 December 2000 would be expressed as "20001231T222700-0500" as New York is five hours behind UTC in winter. At the same moment in London, the date and time would be expressed as "20010101T032700+0000" or as "20010101T032700-0000" because in London it is now 3:27 a.m. on 1 January 2001. At the same moment in Paris,the date and time would be expressed as "20010101T042700+0100", because Paris is one hour ahead of UTC in winter and it is now 4:27 a.m. on 1 January 2001
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

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Urgency {

            @XmlAttribute(name = "FormalName", required = true)
            protected String formalName;
            @XmlAttribute(name = "Vocabulary")
            protected String vocabulary;
            @XmlAttribute(name = "Scheme")
            protected String scheme;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

            /**
             * Gets the value of the formalName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormalName() {
                return formalName;
            }

            /**
             * Sets the value of the formalName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormalName(String value) {
                this.formalName = value;
            }

            /**
             * Gets the value of the vocabulary property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVocabulary() {
                return vocabulary;
            }

            /**
             * Sets the value of the vocabulary property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVocabulary(String value) {
                this.vocabulary = value;
            }

            /**
             * Gets the value of the scheme property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScheme() {
                return scheme;
            }

            /**
             * Sets the value of the scheme property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScheme(String value) {
                this.scheme = value;
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

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="InsertBefore">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                 &lt;attribute name="DuidRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="InsertAfter">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                 &lt;attribute name="DuidRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Replace">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                 &lt;attribute name="DuidRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Delete">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                 &lt;attribute name="DuidRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "insertBeforeOrInsertAfterOrReplace"
    })
    public static class Update {

        @XmlElements({
            @XmlElement(name = "InsertBefore", type = NewsItemType.Update.InsertBefore.class),
            @XmlElement(name = "InsertAfter", type = NewsItemType.Update.InsertAfter.class),
            @XmlElement(name = "Replace", type = NewsItemType.Update.Replace.class),
            @XmlElement(name = "Delete", type = NewsItemType.Update.Delete.class)
        })
        protected List<Object> insertBeforeOrInsertAfterOrReplace;
        @XmlAttribute(name = "Duid")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String duid;
        @XmlAttribute(name = "Euid")
        protected String euid;

        /**
         * Gets the value of the insertBeforeOrInsertAfterOrReplace property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the insertBeforeOrInsertAfterOrReplace property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInsertBeforeOrInsertAfterOrReplace().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NewsItemType.Update.InsertBefore }
         * {@link NewsItemType.Update.InsertAfter }
         * {@link NewsItemType.Update.Replace }
         * {@link NewsItemType.Update.Delete }
         * 
         * 
         */
        public List<Object> getInsertBeforeOrInsertAfterOrReplace() {
            if (insertBeforeOrInsertAfterOrReplace == null) {
                insertBeforeOrInsertAfterOrReplace = new ArrayList<Object>();
            }
            return this.insertBeforeOrInsertAfterOrReplace;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *       &lt;attribute name="DuidRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Delete {

            @XmlAttribute(name = "DuidRef", required = true)
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object duidRef;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

            /**
             * Gets the value of the duidRef property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getDuidRef() {
                return duidRef;
            }

            /**
             * Sets the value of the duidRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setDuidRef(Object value) {
                this.duidRef = value;
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

        }


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
         *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *       &lt;attribute name="DuidRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "any"
        })
        public static class InsertAfter {

            @XmlAnyElement(lax = true)
            protected List<Object> any;
            @XmlAttribute(name = "DuidRef", required = true)
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object duidRef;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Element }
             * {@link Object }
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
             * Gets the value of the duidRef property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getDuidRef() {
                return duidRef;
            }

            /**
             * Sets the value of the duidRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setDuidRef(Object value) {
                this.duidRef = value;
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

        }


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
         *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *       &lt;attribute name="DuidRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "any"
        })
        public static class InsertBefore {

            @XmlAnyElement(lax = true)
            protected List<Object> any;
            @XmlAttribute(name = "DuidRef", required = true)
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object duidRef;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Element }
             * {@link Object }
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
             * Gets the value of the duidRef property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getDuidRef() {
                return duidRef;
            }

            /**
             * Sets the value of the duidRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setDuidRef(Object value) {
                this.duidRef = value;
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

        }


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
         *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *       &lt;attribute name="DuidRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "any"
        })
        public static class Replace {

            @XmlAnyElement(lax = true)
            protected List<Object> any;
            @XmlAttribute(name = "DuidRef", required = true)
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object duidRef;
            @XmlAttribute(name = "Duid")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String duid;
            @XmlAttribute(name = "Euid")
            protected String euid;

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Element }
             * {@link Object }
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
             * Gets the value of the duidRef property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getDuidRef() {
                return duidRef;
            }

            /**
             * Sets the value of the duidRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setDuidRef(Object value) {
                this.duidRef = value;
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

        }

    }

}
