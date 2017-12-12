package com.action;

import java.io.File;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
/**
 *用注解方式开发
 */
@Namespace("/")
@ParentPackage("struts-default")
@Result(name="success",location="/success.jsp")
public class UploadAction {

	File doc;
	String docFileName;
	String docContentType;
	public File getDoc() {
		return doc;
	}
	public void setDoc(File doc) {
		this.doc = doc;
	}
	public String getDocFileName() {
		return docFileName;
	}
	public void setDocFileName(String docFileName) {
		this.docFileName = docFileName;
	}
	public String getDocContentType() {
		return docContentType;
	}
	public void setDocContentType(String docContentType) {
		this.docContentType = docContentType;
	}
	@Action("upload")
	 public String upload() {
	        System.out.println(doc);
	        System.out.println(docFileName);
	        System.out.println(docContentType);
	        return "success";
	    }
}
