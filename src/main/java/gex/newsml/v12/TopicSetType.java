
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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A container for Topics. The value of the FormalName attribute is a formal name for the TopicSet. Its meaning and permitted values are determined by a controlled vocabulary as described in the comment to the formalname attribute group declaration above.
 * 
 * <p>Java class for TopicSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopicSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
 *         &lt;element name="TopicSetRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                 &lt;attribute name="TopicSet" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Topic" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
 *                   &lt;element name="TopicType" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FormalName" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attribute name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                           &lt;attribute name="Variant" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                 &lt;attribute name="Details" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
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
@XmlType(name = "TopicSetType", propOrder = {
    "comment",
    "catalog",
    "topicSetRef",
    "topic"
})
public class TopicSetType {

    @XmlElement(name = "Comment")
    protected List<CommentType> comment;
    @XmlElement(name = "Catalog")
    protected CatalogType catalog;
    @XmlElement(name = "TopicSetRef")
    protected List<TopicSetType.TopicSetRef> topicSetRef;
    @XmlElement(name = "Topic")
    protected List<TopicSetType.Topic> topic;
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
     * Gets the value of the topicSetRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topicSetRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopicSetRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopicSetType.TopicSetRef }
     * 
     * 
     */
    public List<TopicSetType.TopicSetRef> getTopicSetRef() {
        if (topicSetRef == null) {
            topicSetRef = new ArrayList<TopicSetType.TopicSetRef>();
        }
        return this.topicSetRef;
    }

    /**
     * Gets the value of the topic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TopicSetType.Topic }
     * 
     * 
     */
    public List<TopicSetType.Topic> getTopic() {
        if (topic == null) {
            topic = new ArrayList<TopicSetType.Topic>();
        }
        return this.topic;
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
     *         &lt;element name="Catalog" type="{http://iptc.org/std/NewsML/2003-10-10/}CatalogType" minOccurs="0"/>
     *         &lt;element name="TopicType" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}formalname"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FormalName" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                 &lt;attribute name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *                 &lt;attribute name="Variant" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Property" type="{http://iptc.org/std/NewsML/2003-10-10/}PropertyType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *       &lt;attribute name="Details" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "catalog",
        "topicType",
        "formalName",
        "description",
        "property"
    })
    public static class Topic {

        @XmlElement(name = "Comment")
        protected List<CommentType> comment;
        @XmlElement(name = "Catalog")
        protected CatalogType catalog;
        @XmlElement(name = "TopicType", required = true)
        protected List<TopicSetType.Topic.TopicType> topicType;
        @XmlElement(name = "FormalName")
        protected List<TopicSetType.Topic.FormalName> formalName;
        @XmlElement(name = "Description")
        protected List<TopicSetType.Topic.Description> description;
        @XmlElement(name = "Property")
        protected List<PropertyType> property;
        @XmlAttribute(name = "Details")
        protected String details;
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
         * Gets the value of the topicType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the topicType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTopicType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TopicSetType.Topic.TopicType }
         * 
         * 
         */
        public List<TopicSetType.Topic.TopicType> getTopicType() {
            if (topicType == null) {
                topicType = new ArrayList<TopicSetType.Topic.TopicType>();
            }
            return this.topicType;
        }

        /**
         * Gets the value of the formalName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the formalName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFormalName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TopicSetType.Topic.FormalName }
         * 
         * 
         */
        public List<TopicSetType.Topic.FormalName> getFormalName() {
            if (formalName == null) {
                formalName = new ArrayList<TopicSetType.Topic.FormalName>();
            }
            return this.formalName;
        }

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TopicSetType.Topic.Description }
         * 
         * 
         */
        public List<TopicSetType.Topic.Description> getDescription() {
            if (description == null) {
                description = new ArrayList<TopicSetType.Topic.Description>();
            }
            return this.description;
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
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetails() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetails(String value) {
            this.details = value;
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
         *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
         *       &lt;attribute name="Variant" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class Description {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "language")
            protected String lang;
            @XmlAttribute(name = "Variant")
            protected String variant;
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
             * Gets the value of the variant property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVariant() {
                return variant;
            }

            /**
             * Sets the value of the variant property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVariant(String value) {
                this.variant = value;
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
        public static class FormalName {

            @XmlValue
            protected String value;
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
        public static class TopicType {

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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Comment" type="{http://iptc.org/std/NewsML/2003-10-10/}CommentType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *       &lt;attribute name="TopicSet" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class TopicSetRef {

        @XmlElement(name = "Comment")
        protected List<CommentType> comment;
        @XmlAttribute(name = "TopicSet")
        protected String topicSet;
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
         * Gets the value of the topicSet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTopicSet() {
            return topicSet;
        }

        /**
         * Sets the value of the topicSet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTopicSet(String value) {
            this.topicSet = value;
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
