/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: EvoobjectsToTypesDescriptor.java,v 1.1 2003/11/11 08:19:37 fourfive Exp $
 */

package org.artistar.tahoe.config.objecttype;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.mapping.AccessMode;
import org.exolab.castor.xml.TypeValidator;
import org.exolab.castor.xml.XMLFieldDescriptor;
import org.exolab.castor.xml.validators.*;

/**
 * Class EvoobjectsToTypesDescriptor.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/11/11 08:19:37 $
 */
public class EvoobjectsToTypesDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field nsPrefix
     */
    private java.lang.String nsPrefix;

    /**
     * Field nsURI
     */
    private java.lang.String nsURI;

    /**
     * Field xmlName
     */
    private java.lang.String xmlName;

    /**
     * Field identity
     */
    private org.exolab.castor.xml.XMLFieldDescriptor identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public EvoobjectsToTypesDescriptor() {
        super();
        nsURI = "http://www.evologic.com.uk/evologic/evoobjectstotypes";
        xmlName = "evoobjects-to-types";
        
        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.xml.XMLFieldHandler              handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- initialize element descriptors
        
        //-- _akey
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.objecttype.Akey.class, "_akey", "akey", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                EvoobjectsToTypes target = (EvoobjectsToTypes) object;
                return target.getAkey();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    EvoobjectsToTypes target = (EvoobjectsToTypes) object;
                    target.setAkey( (org.artistar.tahoe.config.objecttype.Akey) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.objecttype.Akey();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evoobjectstotypes");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _akey
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _pkey
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.objecttype.Pkey.class, "_pkey", "pkey", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                EvoobjectsToTypes target = (EvoobjectsToTypes) object;
                return target.getPkey();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    EvoobjectsToTypes target = (EvoobjectsToTypes) object;
                    target.setPkey( (org.artistar.tahoe.config.objecttype.Pkey) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.objecttype.Pkey();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evoobjectstotypes");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _pkey
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _ckey
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.objecttype.Ckey.class, "_ckey", "ckey", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                EvoobjectsToTypes target = (EvoobjectsToTypes) object;
                return target.getCkey();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    EvoobjectsToTypes target = (EvoobjectsToTypes) object;
                    target.setCkey( (org.artistar.tahoe.config.objecttype.Ckey) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.objecttype.Ckey();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evoobjectstotypes");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _ckey
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _validfrom
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.objecttype.Validfrom.class, "_validfrom", "validfrom", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                EvoobjectsToTypes target = (EvoobjectsToTypes) object;
                return target.getValidfrom();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    EvoobjectsToTypes target = (EvoobjectsToTypes) object;
                    target.setValidfrom( (org.artistar.tahoe.config.objecttype.Validfrom) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.objecttype.Validfrom();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evoobjectstotypes");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _validfrom
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _validto
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.objecttype.Validto.class, "_validto", "validto", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                EvoobjectsToTypes target = (EvoobjectsToTypes) object;
                return target.getValidto();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    EvoobjectsToTypes target = (EvoobjectsToTypes) object;
                    target.setValidto( (org.artistar.tahoe.config.objecttype.Validto) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.objecttype.Validto();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evoobjectstotypes");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _validto
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _type
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.objecttype.Type.class, "_type", "type", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                EvoobjectsToTypes target = (EvoobjectsToTypes) object;
                return target.getType();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    EvoobjectsToTypes target = (EvoobjectsToTypes) object;
                    target.setType( (org.artistar.tahoe.config.objecttype.Type) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.objecttype.Type();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evoobjectstotypes");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _type
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _vlock
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.objecttype.Vlock.class, "_vlock", "vlock", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                EvoobjectsToTypes target = (EvoobjectsToTypes) object;
                return target.getVlock();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    EvoobjectsToTypes target = (EvoobjectsToTypes) object;
                    target.setVlock( (org.artistar.tahoe.config.objecttype.Vlock) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.objecttype.Vlock();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evoobjectstotypes");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _vlock
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    } //-- org.artistar.tahoe.config.objecttype.EvoobjectsToTypesDescriptor()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getAccessMode
     */
    public org.exolab.castor.mapping.AccessMode getAccessMode()
    {
        return null;
    } //-- org.exolab.castor.mapping.AccessMode getAccessMode() 

    /**
     * Method getExtends
     */
    public org.exolab.castor.mapping.ClassDescriptor getExtends()
    {
        return null;
    } //-- org.exolab.castor.mapping.ClassDescriptor getExtends() 

    /**
     * Method getIdentity
     */
    public org.exolab.castor.mapping.FieldDescriptor getIdentity()
    {
        return identity;
    } //-- org.exolab.castor.mapping.FieldDescriptor getIdentity() 

    /**
     * Method getJavaClass
     */
    public java.lang.Class getJavaClass()
    {
        return org.artistar.tahoe.config.objecttype.EvoobjectsToTypes.class;
    } //-- java.lang.Class getJavaClass() 

    /**
     * Method getNameSpacePrefix
     */
    public java.lang.String getNameSpacePrefix()
    {
        return nsPrefix;
    } //-- java.lang.String getNameSpacePrefix() 

    /**
     * Method getNameSpaceURI
     */
    public java.lang.String getNameSpaceURI()
    {
        return nsURI;
    } //-- java.lang.String getNameSpaceURI() 

    /**
     * Method getValidator
     */
    public org.exolab.castor.xml.TypeValidator getValidator()
    {
        return this;
    } //-- org.exolab.castor.xml.TypeValidator getValidator() 

    /**
     * Method getXMLName
     */
    public java.lang.String getXMLName()
    {
        return xmlName;
    } //-- java.lang.String getXMLName() 

}
