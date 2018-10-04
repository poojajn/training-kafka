package com.excel.model;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="projectInfo")
public class ProjectInfo {

	private String projectId;
	private String projectName;
	private String projDescri;
	
	private ArrayList<Module> moduleList;
	
	private ArrayList<Requirement> requirList;
	
	
	
	
}
