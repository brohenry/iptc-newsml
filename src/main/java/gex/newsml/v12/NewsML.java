
package gex.newsml.v12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
 *         &lt;element name="TopicSet" type="{http://iptc.org/std/NewsML/2003-10-10/}TopicSetType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="NewsEnvelope">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="TransmissionId" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;simpleContent>
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                             &lt;attribute name="Repeat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/extension>
 *                         &lt;/simpleContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="SentFrom" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
 *                             &lt;/sequence>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="SentTo" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
 *                             &lt;/sequence>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="DateAndTime" type="{http://iptc.org/std/NewsML/2003-10-10/}DateAndTimeType"/>
 *                     &lt;element name="NewsService" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="NewsProduct" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Priority" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                             &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="NewsItem" type="{http://iptc.org/std/NewsML/2003-10-10/}NewsItemType" maxOccurs="unbounded"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *       &lt;attribute name="Version">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="1\.[12]"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "catalog",
    "topicSet",
    "newsEnvelope",
    "newsItem"
})
@XmlRootElement(name = "NewsML")
public class NewsML {

    @XmlElement(name = "Catalog")
    protected CatalogType catalog;
    @XmlElement(name = "TopicSet")
    protected List<TopicSetType> topicSet;
    @XmlElement(name = "NewsEnvelope", required = true)
    protected NewsML.NewsEnvelope newsEnvelope;
    @XmlElement(name = "NewsItem", required = true)
    protected List<NewsItemType> newsItem;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "Duid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String duid;
    @XmlAttribute(name = "Euid")
    protected String euid;

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
     * Gets the value of the topicSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topicSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopicSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopicSetType }
     * 
     * 
     */
    public List<TopicSetType> getTopicSet() {
        if (topicSet == null) {
            topicSet = new ArrayList<TopicSetType>();
        }
        return this.topicSet;
    }

    /**
     * Gets the value of the newsEnvelope property.
     * 
     * @return
     *     possible object is
     *     {@link NewsML.NewsEnvelope }
     *     
     */
    public NewsML.NewsEnvelope getNewsEnvelope() {
        return newsEnvelope;
    }

    /**
     * Sets the value of the newsEnvelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewsML.NewsEnvelope }
     *     
     */
    public void setNewsEnvelope(NewsML.NewsEnvelope value) {
        this.newsEnvelope = value;
    }

    /**
     * Gets the value of the newsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the newsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNewsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NewsItemType }
     * 
     * 
     */
    public List<NewsItemType> getNewsItem() {
        if (newsItem == null) {
            newsItem = new ArrayList<NewsItemType>();
        }
        return this.newsItem;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         &lt;element name="TransmissionId" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                 &lt;attribute name="Repeat" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SentFrom" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SentTo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DateAndTime" type="{http://iptc.org/std/NewsML/2003-10-10/}DateAndTimeType"/>
     *         &lt;element name="NewsService" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="NewsProduct" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Priority" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
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
        "transmissionId",
        "sentFrom",
        "sentTo",
        "dateAndTime",
        "newsService",
        "newsProduct",
        "priority"
    })
    public static class NewsEnvelope {

        @XmlElement(name = "TransmissionId")
        protected NewsML.NewsEnvelope.TransmissionId transmissionId;
        @XmlElement(name = "SentFrom")
        protected NewsML.NewsEnvelope.SentFrom sentFrom;
        @XmlElement(name = "SentTo")
        protected NewsML.NewsEnvelope.SentTo sentTo;
        @XmlElement(name = "DateAndTime", required = true)
        protected DateAndTimeType dateAndTime;
        @XmlElement(name = "NewsService")
        protected List<NewsML.NewsEnvelope.NewsService> newsService;
        @XmlElement(name = "NewsProduct")
        protected List<NewsML.NewsEnvelope.NewsProduct> newsProduct;
        @XmlElement(name = "Priority")
        protected NewsML.NewsEnvelope.Priority priority;
        @XmlAttribute(name = "Duid")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String duid;
        @XmlAttribute(name = "Euid")
        protected String euid;

        /**
         * Gets the value of the transmissionId property.
         * 
         * @return
         *     possible object is
         *     {@link NewsML.NewsEnvelope.TransmissionId }
         *     
         */
        public NewsML.NewsEnvelope.TransmissionId getTransmissionId() {
            return transmissionId;
        }

        /**
         * Sets the value of the transmissionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewsML.NewsEnvelope.TransmissionId }
         *     
         */
        public void setTransmissionId(NewsML.NewsEnvelope.TransmissionId value) {
            this.transmissionId = value;
        }

        /**
         * Gets the value of the sentFrom property.
         * 
         * @return
         *     possible object is
         *     {@link NewsML.NewsEnvelope.SentFrom }
         *     
         */
        public NewsML.NewsEnvelope.SentFrom getSentFrom() {
            return sentFrom;
        }

        /**
         * Sets the value of the sentFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewsML.NewsEnvelope.SentFrom }
         *     
         */
        public void setSentFrom(NewsML.NewsEnvelope.SentFrom value) {
            this.sentFrom = value;
        }

        /**
         * Gets the value of the sentTo property.
         * 
         * @return
         *     possible object is
         *     {@link NewsML.NewsEnvelope.SentTo }
         *     
         */
        public NewsML.NewsEnvelope.SentTo getSentTo() {
            return sentTo;
        }

        /**
         * Sets the value of the sentTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewsML.NewsEnvelope.SentTo }
         *     
         */
        public void setSentTo(NewsML.NewsEnvelope.SentTo value) {
            this.sentTo = value;
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
         * Gets the value of the newsService property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the newsService property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNewsService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NewsML.NewsEnvelope.NewsService }
         * 
         * 
         */
        public List<NewsML.NewsEnvelope.NewsService> getNewsService() {
            if (newsService == null) {
                newsService = new ArrayList<NewsML.NewsEnvelope.NewsService>();
            }
            return this.newsService;
        }

        /**
         * Gets the value of the newsProduct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the newsProduct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNewsProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NewsML.NewsEnvelope.NewsProduct }
         * 
         * 
         */
        public List<NewsML.NewsEnvelope.NewsProduct> getNewsProduct() {
            if (newsProduct == null) {
                newsProduct = new ArrayList<NewsML.NewsEnvelope.NewsProduct>();
            }
            return this.newsProduct;
        }

        /**
         * Gets the value of the priority property.
         * 
         * @return
         *     possible object is
         *     {@link NewsML.NewsEnvelope.Priority }
         *     
         */
        public NewsML.NewsEnvelope.Priority getPriority() {
            return priority;
        }

        /**
         * Sets the value of the priority property.
         * 
         * @param value
         *     allowed object is
         *     {@link NewsML.NewsEnvelope.Priority }
         *     
         */
        public void setPriority(NewsML.NewsEnvelope.Priority value) {
            this.priority = value;
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
        public static class NewsProduct {

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
        public static class NewsService {

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
        public static class Priority {

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
         *         &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
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
            "comment",
            "party"
        })
        public static class SentFrom {

            @XmlElement(name = "Comment")
            protected List<CommentType> comment;
            @XmlElement(name = "Party", required = true)
            protected List<gex.newsml.v12.NewsComponentType.AdministrativeMetadata.Contributor.Party> party;
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
             * Gets the value of the party property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the party property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link gex.newsml.v12.NewsComponentType.AdministrativeMetadata.Contributor.Party }
             * 
             * 
             */
            public List<gex.newsml.v12.NewsComponentType.AdministrativeMetadata.Contributor.Party> getParty() {
                if (party == null) {
                    party = new ArrayList<gex.newsml.v12.NewsComponentType.AdministrativeMetadata.Contributor.Party>();
                }
                return this.party;
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
         *         &lt;group ref="{http://iptc.org/std/NewsML/2003-10-10/}party"/>
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
            "comment",
            "party"
        })
        public static class SentTo {

            @XmlElement(name = "Comment")
            protected List<CommentType> comment;
            @XmlElement(name = "Party", required = true)
            protected List<gex.newsml.v12.NewsComponentType.AdministrativeMetadata.Contributor.Party> party;
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
             * Gets the value of the party property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the party property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link gex.newsml.v12.NewsComponentType.AdministrativeMetadata.Contributor.Party }
             * 
             * 
             */
            public List<gex.newsml.v12.NewsComponentType.AdministrativeMetadata.Contributor.Party> getParty() {
                if (party == null) {
                    party = new ArrayList<gex.newsml.v12.NewsComponentType.AdministrativeMetadata.Contributor.Party>();
                }
                return this.party;
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
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
         *       &lt;attribute name="Repeat" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class TransmissionId {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Repeat")
            protected String repeat;
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
             * Gets the value of the repeat property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRepeat() {
                return repeat;
            }

            /**
             * Sets the value of the repeat property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRepeat(String value) {
                this.repeat = value;
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
