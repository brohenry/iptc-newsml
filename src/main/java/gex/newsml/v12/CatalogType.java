
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

import lombok.ToString;


/**
 * A container for Resource and TopicUse elements. Resource elements map URNs to URLs and indicate default vocabularies which apply to the formal names of certain elements within the subtree that begins with the immediate parent of the Catalog element. TopicUse elements indicate where in the NewsML document certain Topics are used. The optional Href attribute provides a pointer to a Catalog element elsewhere in this or another document. Its value consists of a # character followed by the value of the Duid attribute of the referenced Catalog element and preceded, if the referenced Catalog is not in the current document, by an http URL or a NewsML URN identifying the document or NewsItem in which the Catalog appears. If the Href attribute is present on a Catalog element, then that element should be empty. If it contains subelements, the NewsML system may signal an error.
 * 
 * <p>Java class for CatalogType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Resource" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Urn" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Url" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DefaultVocabularyFor" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *                           &lt;attribute name="Context" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *         &lt;element name="TopicUse" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Topic" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Context" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
 *       &lt;attribute name="Href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogType", propOrder = {
    "resource",
    "topicUse"
})
@ToString
public class CatalogType {

    @XmlElement(name = "Resource")
    protected List<CatalogType.Resource> resource;
    @XmlElement(name = "TopicUse")
    protected List<CatalogType.TopicUse> topicUse;
    @XmlAttribute(name = "Href")
    protected String href;
    @XmlAttribute(name = "Duid")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String duid;
    @XmlAttribute(name = "Euid")
    protected String euid;

    /**
     * Gets the value of the resource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogType.Resource }
     * 
     * 
     */
    public List<CatalogType.Resource> getResource() {
        if (resource == null) {
            resource = new ArrayList<CatalogType.Resource>();
        }
        return this.resource;
    }

    /**
     * Gets the value of the topicUse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topicUse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopicUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogType.TopicUse }
     * 
     * 
     */
    public List<CatalogType.TopicUse> getTopicUse() {
        if (topicUse == null) {
            topicUse = new ArrayList<CatalogType.TopicUse>();
        }
        return this.topicUse;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Urn" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Url" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DefaultVocabularyFor" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://iptc.org/std/NewsML/2003-10-10/}localid"/>
     *                 &lt;attribute name="Context" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "urn",
        "url",
        "defaultVocabularyFor"
    })
		@ToString
    public static class Resource {

        @XmlElement(name = "Urn")
        protected CatalogType.Resource.Urn urn;
        @XmlElement(name = "Url")
        protected List<CatalogType.Resource.Url> url;
        @XmlElement(name = "DefaultVocabularyFor")
        protected List<CatalogType.Resource.DefaultVocabularyFor> defaultVocabularyFor;
        @XmlAttribute(name = "Duid")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String duid;
        @XmlAttribute(name = "Euid")
        protected String euid;

        /**
         * Gets the value of the urn property.
         * 
         * @return
         *     possible object is
         *     {@link CatalogType.Resource.Urn }
         *     
         */
        public CatalogType.Resource.Urn getUrn() {
            return urn;
        }

        /**
         * Sets the value of the urn property.
         * 
         * @param value
         *     allowed object is
         *     {@link CatalogType.Resource.Urn }
         *     
         */
        public void setUrn(CatalogType.Resource.Urn value) {
            this.urn = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the url property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUrl().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CatalogType.Resource.Url }
         * 
         * 
         */
        public List<CatalogType.Resource.Url> getUrl() {
            if (url == null) {
                url = new ArrayList<CatalogType.Resource.Url>();
            }
            return this.url;
        }

        /**
         * Gets the value of the defaultVocabularyFor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the defaultVocabularyFor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDefaultVocabularyFor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CatalogType.Resource.DefaultVocabularyFor }
         * 
         * 
         */
        public List<CatalogType.Resource.DefaultVocabularyFor> getDefaultVocabularyFor() {
            if (defaultVocabularyFor == null) {
                defaultVocabularyFor = new ArrayList<CatalogType.Resource.DefaultVocabularyFor>();
            }
            return this.defaultVocabularyFor;
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
         *       &lt;attribute name="Context" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class DefaultVocabularyFor {

            @XmlAttribute(name = "Context", required = true)
            protected String context;
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
             * Gets the value of the context property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContext() {
                return context;
            }

            /**
             * Sets the value of the context property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContext(String value) {
                this.context = value;
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
				@ToString
        public static class Url {

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
				@ToString
        public static class Urn {

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
     *       &lt;attribute name="Topic" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Context" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class TopicUse {

        @XmlAttribute(name = "Topic", required = true)
        protected String topic;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * Gets the value of the topic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTopic() {
            return topic;
        }

        /**
         * Sets the value of the topic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTopic(String value) {
            this.topic = value;
        }

        /**
         * Gets the value of the context property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContext() {
            return context;
        }

        /**
         * Sets the value of the context property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContext(String value) {
            this.context = value;
        }

    }

}
