/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 0.9.4.3</a>, using an XML
 * Schema.
 * $Id: AttributesType.java,v 1.1 2003/11/11 08:19:27 fourfive Exp $
 */

package org.artistar.tahoe.config.type;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;

/**
 * Class AttributesType.
 * 
 * @version $Revision: 1.1 $ $Date: 2003/11/11 08:19:27 $
 */
public abstract class AttributesType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _integers
     */
    private org.artistar.tahoe.config.type.Integers _integers;

    /**
     * Field _numbers
     */
    private org.artistar.tahoe.config.type.Numbers _numbers;

    /**
     * Field _strings
     */
    private org.artistar.tahoe.config.type.Strings _strings;

    /**
     * Field _dates
     */
    private org.artistar.tahoe.config.type.Dates _dates;


      //----------------/
     //- Constructors -/
    //----------------/

    public AttributesType() {
        super();
    } //-- org.artistar.tahoe.config.type.AttributesType()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dates'.
     * 
     * @return the value of field 'dates'.
     */
    public org.artistar.tahoe.config.type.Dates getDates()
    {
        return this._dates;
    } //-- org.artistar.tahoe.config.type.Dates getDates() 

    /**
     * Returns the value of field 'integers'.
     * 
     * @return the value of field 'integers'.
     */
    public org.artistar.tahoe.config.type.Integers getIntegers()
    {
        return this._integers;
    } //-- org.artistar.tahoe.config.type.Integers getIntegers() 

    /**
     * Returns the value of field 'numbers'.
     * 
     * @return the value of field 'numbers'.
     */
    public org.artistar.tahoe.config.type.Numbers getNumbers()
    {
        return this._numbers;
    } //-- org.artistar.tahoe.config.type.Numbers getNumbers() 

    /**
     * Returns the value of field 'strings'.
     * 
     * @return the value of field 'strings'.
     */
    public org.artistar.tahoe.config.type.Strings getStrings()
    {
        return this._strings;
    } //-- org.artistar.tahoe.config.type.Strings getStrings() 

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
     * Sets the value of field 'dates'.
     * 
     * @param dates the value of field 'dates'.
     */
    public void setDates(org.artistar.tahoe.config.type.Dates dates)
    {
        this._dates = dates;
    } //-- void setDates(org.artistar.tahoe.config.type.Dates) 

    /**
     * Sets the value of field 'integers'.
     * 
     * @param integers the value of field 'integers'.
     */
    public void setIntegers(org.artistar.tahoe.config.type.Integers integers)
    {
        this._integers = integers;
    } //-- void setIntegers(org.artistar.tahoe.config.type.Integers) 

    /**
     * Sets the value of field 'numbers'.
     * 
     * @param numbers the value of field 'numbers'.
     */
    public void setNumbers(org.artistar.tahoe.config.type.Numbers numbers)
    {
        this._numbers = numbers;
    } //-- void setNumbers(org.artistar.tahoe.config.type.Numbers) 

    /**
     * Sets the value of field 'strings'.
     * 
     * @param strings the value of field 'strings'.
     */
    public void setStrings(org.artistar.tahoe.config.type.Strings strings)
    {
        this._strings = strings;
    } //-- void setStrings(org.artistar.tahoe.config.type.Strings) 

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
