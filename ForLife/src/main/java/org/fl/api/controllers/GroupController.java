package org.fl.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.fl.api.model.Group;
import org.fl.api.model.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group")
public class GroupController {
	private static List<Page> pages = new ArrayList<Page>();
	static{
		Page page1 = new Page();
		page1.setId(1);
		page1.setName("page name 1");
		page1.setFulltext("full text page 1 full text page 1 full text page 1 full text page 1 full text page 1");
		
		Page page2 = new Page();
		page2.setId(2);
		page2.setName("page name 2");
		page2.setFulltext("full text page 2 full text page 2 full text page 2 full text page 2 full text page 2");
		
		pages.add(page1);
		pages.add(page2);
		
	}
	@RequestMapping("/getAll")
	public List<Group> getAll(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		List<Group> groups = new ArrayList<Group>();
		Group group = new Group();
		group.setId(1);
		group.setName("group name 1");
		group.setPages(pages);
		
		Group group2 = new Group();
		group2.setId(2);
		group2.setName("group name 2");
		group2.setPages(pages);
		
		groups.add(group);
		groups.add(group2);
		
		return groups;

	}

	@RequestMapping(path = "{id}", method = RequestMethod.GET)
	public Group get(@PathVariable Integer id) {
		Group group = new Group();
		group.setId(id);
		group.setName("get group work");
		group.setPages(pages);
		return group;
	}
	
	@RequestMapping(path="/add", method = RequestMethod.POST)
	public Group add(@RequestBody Group group) {
		group.setName("add group work");
		group.setPages(pages);
		return group;
	}
	@RequestMapping(path="/edit", method = RequestMethod.PUT)
	public Group edit(@RequestBody Group group) {
		group.setName("edit group work");
		group.setPages(pages);
		return group;
	}
	@RequestMapping(path="/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer id) {
		return "delete work";
	}
}
