/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: Validto.java,v 1.1 2003/11/11 08:19:39 fourfive Exp $
 */

package org.artistar.tahoe.config.object;

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
 * Class Validto.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/11/11 08:19:39 $
 */
public class Validto implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _value
     */
    private org.exolab.castor.types.Date _value;


      //----------------/
     //- Constructors -/
    //----------------/

    public Validto() {
        super();
    } //-- org.artistar.tahoe.config.object.Validto()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'value'.
     * 
     * @return the value of field 'value'.
     */
    public org.exolab.castor.types.Date getValue()
    {
        return this._value;
    } //-- org.exolab.castor.types.Date getValue() 

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
     * Sets the value of field 'value'.
     * 
     * @param value the value of field 'value'.
     */
    public void setValue(org.exolab.castor.types.Date value)
    {
        this._value = value;
    } //-- void setValue(org.exolab.castor.types.Date) 

    /**
     * Method unmarshal
     * 
     * @param reader
     */
    public static org.artistar.tahoe.config.object.Validto unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (org.artistar.tahoe.config.object.Validto) Unmarshaller.unmarshal(org.artistar.tahoe.config.object.Validto.class, reader);
    } //-- org.artistar.tahoe.config.object.Validto unmarshal(java.io.Reader) 

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
