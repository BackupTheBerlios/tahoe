/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Evotype.java,v 1.1 2003/11/11 08:19:09 fourfive Exp $
 */

package org.artistar.tahoe.config.type;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Comment describing your root element
 * 
 * @version $Revision: 1.1 $ $Date: 2003/11/11 08:19:09 $
 */
public class Evotype implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _akey
     */
    private org.artistar.tahoe.config.type.Akey _akey;

    /**
     * Field _nodetype
     */
    private org.artistar.tahoe.config.type.Nodetype _nodetype;

    /**
     * Field _nodename
     */
    private org.artistar.tahoe.config.type.Nodename _nodename;

    /**
     * Field _applKey
     */
    private org.artistar.tahoe.config.type.ApplKey _applKey;

    /**
     * Field _owner
     */
    private org.artistar.tahoe.config.type.Owner _owner;

    /**
     * Field _divisionId
     */
    private org.artistar.tahoe.config.type.DivisionId _divisionId;

    /**
     * Field _atinherit
     */
    private org.artistar.tahoe.config.type.Atinherit _atinherit;

    /**
     * Field _attributes
     */
    private org.artistar.tahoe.config.type.Attributes _attributes;


      //----------------/
     //- Constructors -/
    //----------------/

    public Evotype() {
        super();
    } //-- org.artistar.tahoe.config.type.Evotype()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'akey'.
     * 
     * @return the value of field 'akey'.
     */
    public org.artistar.tahoe.config.type.Akey getAkey()
    {
        return this._akey;
    } //-- org.artistar.tahoe.config.type.Akey getAkey() 

    /**
     * Returns the value of field 'applKey'.
     * 
     * @return the value of field 'applKey'.
     */
    public org.artistar.tahoe.config.type.ApplKey getApplKey()
    {
        return this._applKey;
    } //-- org.artistar.tahoe.config.type.ApplKey getApplKey() 

    /**
     * Returns the value of field 'atinherit'.
     * 
     * @return the value of field 'atinherit'.
     */
    public org.artistar.tahoe.config.type.Atinherit getAtinherit()
    {
        return this._atinherit;
    } //-- org.artistar.tahoe.config.type.Atinherit getAtinherit() 

    /**
     * Returns the value of field 'attributes'.
     * 
     * @return the value of field 'attributes'.
     */
    public org.artistar.tahoe.config.type.Attributes getAttributes()
    {
        return this._attributes;
    } //-- org.artistar.tahoe.config.type.Attributes getAttributes() 

    /**
     * Returns the value of field 'divisionId'.
     * 
     * @return the value of field 'divisionId'.
     */
    public org.artistar.tahoe.config.type.DivisionId getDivisionId()
    {
        return this._divisionId;
    } //-- org.artistar.tahoe.config.type.DivisionId getDivisionId() 

    /**
     * Returns the value of field 'nodename'.
     * 
     * @return the value of field 'nodename'.
     */
    public org.artistar.tahoe.config.type.Nodename getNodename()
    {
        return this._nodename;
    } //-- org.artistar.tahoe.config.type.Nodename getNodename() 

    /**
     * Returns the value of field 'nodetype'.
     * 
     * @return the value of field 'nodetype'.
     */
    public org.artistar.tahoe.config.type.Nodetype getNodetype()
    {
        return this._nodetype;
    } //-- org.artistar.tahoe.config.type.Nodetype getNodetype() 

    /**
     * Returns the value of field 'owner'.
     * 
     * @return the value of field 'owner'.
     */
    public org.artistar.tahoe.config.type.Owner getOwner()
    {
        return this._owner;
    } //-- org.artistar.tahoe.config.type.Owner getOwner() 

    /**
     * Method isValid
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'akey'.
     * 
     * @param akey the value of field 'akey'.
     */
    public void setAkey(org.artistar.tahoe.config.type.Akey akey)
    {
        this._akey = akey;
    } //-- void setAkey(org.artistar.tahoe.config.type.Akey) 

    /**
     * Sets the value of field 'applKey'.
     * 
     * @param applKey the value of field 'applKey'.
     */
    public void setApplKey(org.artistar.tahoe.config.type.ApplKey applKey)
    {
        this._applKey = applKey;
    } //-- void setApplKey(org.artistar.tahoe.config.type.ApplKey) 

    /**
     * Sets the value of field 'atinherit'.
     * 
     * @param atinherit the value of field 'atinherit'.
     */
    public void setAtinherit(org.artistar.tahoe.config.type.Atinherit atinherit)
    {
        this._atinherit = atinherit;
    } //-- void setAtinherit(org.artistar.tahoe.config.type.Atinherit) 

    /**
     * Sets the value of field 'attributes'.
     * 
     * @param attributes the value of field 'attributes'.
     */
    public void setAttributes(org.artistar.tahoe.config.type.Attributes attributes)
    {
        this._attributes = attributes;
    } //-- void setAttributes(org.artistar.tahoe.config.type.Attributes) 

    /**
     * Sets the value of field 'divisionId'.
     * 
     * @param divisionId the value of field 'divisionId'.
     */
    public void setDivisionId(org.artistar.tahoe.config.type.DivisionId divisionId)
    {
        this._divisionId = divisionId;
    } //-- void setDivisionId(org.artistar.tahoe.config.type.DivisionId) 

    /**
     * Sets the value of field 'nodename'.
     * 
     * @param nodename the value of field 'nodename'.
     */
    public void setNodename(org.artistar.tahoe.config.type.Nodename nodename)
    {
        this._nodename = nodename;
    } //-- void setNodename(org.artistar.tahoe.config.type.Nodename) 

    /**
     * Sets the value of field 'nodetype'.
     * 
     * @param nodetype the value of field 'nodetype'.
     */
    public void setNodetype(org.artistar.tahoe.config.type.Nodetype nodetype)
    {
        this._nodetype = nodetype;
    } //-- void setNodetype(org.artistar.tahoe.config.type.Nodetype) 

    /**
     * Sets the value of field 'owner'.
     * 
     * @param owner the value of field 'owner'.
     */
    public void setOwner(org.artistar.tahoe.config.type.Owner owner)
    {
        this._owner = owner;
    } //-- void setOwner(org.artistar.tahoe.config.type.Owner) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.artistar.tahoe.config.type.Evotype unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.artistar.tahoe.config.type.Evotype) Unmarshaller.unmarshal(org.artistar.tahoe.config.type.Evotype.class, reader);
    } //-- org.artistar.tahoe.config.type.Evotype unmarshal(java.io.Reader) 

    /**
     * Method validate
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
