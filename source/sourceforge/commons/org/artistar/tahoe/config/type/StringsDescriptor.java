/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: StringsDescriptor.java,v 1.1 2003/11/11 08:19:34 fourfive Exp $
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
 * Class StringsDescriptor.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/11/11 08:19:34 $
 */
public class StringsDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public StringsDescriptor() {
        super();
        nsURI = "http://www.evologic.com.uk/evologic/evotype";
        xmlName = "strings";
        
        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.xml.XMLFieldHandler              handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors
        
        //-- initialize element descriptors
        
        //-- _AT020AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT020AT.class, "_AT020AT", "AT020AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT020AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT020AT( (org.artistar.tahoe.config.type.AT020AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT020AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT020AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT021AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT021AT.class, "_AT021AT", "AT021AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT021AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT021AT( (org.artistar.tahoe.config.type.AT021AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT021AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT021AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT022AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT022AT.class, "_AT022AT", "AT022AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT022AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT022AT( (org.artistar.tahoe.config.type.AT022AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT022AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT022AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT023AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT023AT.class, "_AT023AT", "AT023AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT023AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT023AT( (org.artistar.tahoe.config.type.AT023AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT023AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT023AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT024AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT024AT.class, "_AT024AT", "AT024AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT024AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT024AT( (org.artistar.tahoe.config.type.AT024AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT024AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT024AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT025AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT025AT.class, "_AT025AT", "AT025AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT025AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT025AT( (org.artistar.tahoe.config.type.AT025AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT025AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT025AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT026AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT026AT.class, "_AT026AT", "AT026AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT026AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT026AT( (org.artistar.tahoe.config.type.AT026AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT026AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT026AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT027AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT027AT.class, "_AT027AT", "AT027AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT027AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT027AT( (org.artistar.tahoe.config.type.AT027AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT027AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT027AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT028AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT028AT.class, "_AT028AT", "AT028AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT028AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT028AT( (org.artistar.tahoe.config.type.AT028AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT028AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT028AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT029AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT029AT.class, "_AT029AT", "AT029AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT029AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT029AT( (org.artistar.tahoe.config.type.AT029AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT029AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT029AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT030AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT030AT.class, "_AT030AT", "AT030AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT030AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT030AT( (org.artistar.tahoe.config.type.AT030AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT030AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT030AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT031AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT031AT.class, "_AT031AT", "AT031AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT031AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT031AT( (org.artistar.tahoe.config.type.AT031AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT031AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT031AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT032AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT032AT.class, "_AT032AT", "AT032AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT032AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT032AT( (org.artistar.tahoe.config.type.AT032AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT032AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT032AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT033AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT033AT.class, "_AT033AT", "AT033AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT033AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT033AT( (org.artistar.tahoe.config.type.AT033AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT033AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT033AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT034AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT034AT.class, "_AT034AT", "AT034AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT034AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT034AT( (org.artistar.tahoe.config.type.AT034AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT034AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT034AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT035AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT035AT.class, "_AT035AT", "AT035AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT035AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT035AT( (org.artistar.tahoe.config.type.AT035AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT035AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT035AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT036AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT036AT.class, "_AT036AT", "AT036AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT036AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT036AT( (org.artistar.tahoe.config.type.AT036AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT036AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT036AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT037AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT037AT.class, "_AT037AT", "AT037AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT037AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT037AT( (org.artistar.tahoe.config.type.AT037AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT037AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT037AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT038AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT038AT.class, "_AT038AT", "AT038AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT038AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT038AT( (org.artistar.tahoe.config.type.AT038AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT038AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT038AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _AT039AT
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.artistar.tahoe.config.type.AT039AT.class, "_AT039AT", "AT039AT", org.exolab.castor.xml.NodeType.Element);
        handler = (new org.exolab.castor.xml.XMLFieldHandler() {
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                Strings target = (Strings) object;
                return target.getAT039AT();
            }
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    Strings target = (Strings) object;
                    target.setAT039AT( (org.artistar.tahoe.config.type.AT039AT) value);
                }
                catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            public java.lang.Object newInstance( java.lang.Object parent ) {
                return new org.artistar.tahoe.config.type.AT039AT();
            }
        } );
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.evologic.com.uk/evologic/evotype");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        
        //-- validation code for: _AT039AT
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    } //-- org.artistar.tahoe.config.type.StringsDescriptor()


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
        return org.artistar.tahoe.config.type.Strings.class;
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
