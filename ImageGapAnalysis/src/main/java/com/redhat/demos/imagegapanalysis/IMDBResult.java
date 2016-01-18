package com.redhat.demos.imagegapanalysis;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class IMDBResult implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Title")
   private java.lang.String title;
   @org.kie.api.definition.type.Label(value = "Year")
   private java.lang.String year;
   @org.kie.api.definition.type.Label(value = "imdbId")
   private java.lang.String imdbId;
   @org.kie.api.definition.type.Label(value = "type")
   private java.lang.String type;
   @org.kie.api.definition.type.Label(value = "poster")
   private java.lang.String poster;

   public IMDBResult()
   {
   }

   public java.lang.String getTitle()
   {
      return this.title;
   }

   public void setTitle(java.lang.String title)
   {
      this.title = title;
   }

   public java.lang.String getYear()
   {
      return this.year;
   }

   public void setYear(java.lang.String year)
   {
      this.year = year;
   }

   public java.lang.String getImdbId()
   {
      return this.imdbId;
   }

   public void setImdbId(java.lang.String imdbId)
   {
      this.imdbId = imdbId;
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public java.lang.String getPoster()
   {
      return this.poster;
   }

   public void setPoster(java.lang.String poster)
   {
      this.poster = poster;
   }

   public IMDBResult(java.lang.String title, java.lang.String year,
         java.lang.String imdbId, java.lang.String type,
         java.lang.String poster)
   {
      this.title = title;
      this.year = year;
      this.imdbId = imdbId;
      this.type = type;
      this.poster = poster;
   }

}