/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: EvotypeDescriptor.java,v 1.1 2003/11/11 08:19:19 fourfive Exp $
 */

package org.artistar.tahoe.config.type;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.mapping.AccessMode;
import org.exolab.castor.xml.TypeValidator;
import org.exolab.castor.xml.XMLFieldDescriptor;
import org.exolab.castor.xml.validators.*;

/**
 * Class EvotypeDescriptor.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/11/11 08:19:19 $
 */
public class EvotypeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public EvotypeDescriptor() {
        super();
        nsURI = "http://www.evologic.com.uk/evologic/evotype";
        xmlName = "evotype";
        
        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.xml.XMLFieldHandler              handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- initialize element descriptors
        
        //-- _akey
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.Akey.class, "_akey", "akey", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Evotype target = (Evotype) object;
                return target.getAkey();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Evotype target = (Evotype) object;
                    target.setAkey( (org.artistar.tahoe.config.type.Akey) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.Akey();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _akey
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _nodetype
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.Nodetype.class, "_nodetype", "nodetype", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Evotype target = (Evotype) object;
                return target.getNodetype();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Evotype target = (Evotype) object;
                    target.setNodetype( (org.artistar.tahoe.config.type.Nodetype) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.Nodetype();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _nodetype
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _nodename
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.Nodename.class, "_nodename", "nodename", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Evotype target = (Evotype) object;
                return target.getNodename();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Evotype target = (Evotype) object;
                    target.setNodename( (org.artistar.tahoe.config.type.Nodename) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.Nodename();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _nodename
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _applKey
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.ApplKey.class, "_applKey", "appl-key", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Evotype target = (Evotype) object;
                return target.getApplKey();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Evotype target = (Evotype) object;
                    target.setApplKey( (org.artistar.tahoe.config.type.ApplKey) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.ApplKey();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _applKey
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _owner
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.Owner.class, "_owner", "owner", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Evotype target = (Evotype) object;
                return target.getOwner();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Evotype target = (Evotype) object;
                    target.setOwner( (org.artistar.tahoe.config.type.Owner) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.Owner();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _owner
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _divisionId
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.DivisionId.class, "_divisionId", "division-id", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Evotype target = (Evotype) object;
                return target.getDivisionId();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Evotype target = (Evotype) object;
                    target.setDivisionId( (org.artistar.tahoe.config.type.DivisionId) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.DivisionId();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _divisionId
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _atinherit
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.Atinherit.class, "_atinherit", "atinherit", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Evotype target = (Evotype) object;
                return target.getAtinherit();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Evotype target = (Evotype) object;
                    target.setAtinherit( (org.artistar.tahoe.config.type.Atinherit) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.Atinherit();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _atinherit
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _attributes
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.Attributes.class, "_attributes", "attributes", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Evotype target = (Evotype) object;
                return target.getAttributes();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Evotype target = (Evotype) object;
                    target.setAttributes( (org.artistar.tahoe.config.type.Attributes) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.Attributes();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _attributes
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    } //-- org.artistar.tahoe.config.type.EvotypeDescriptor()


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
        return org.artistar.tahoe.config.type.Evotype.class;
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
