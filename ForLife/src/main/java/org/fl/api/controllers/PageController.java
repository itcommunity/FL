package org.fl.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.fl.api.model.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page")
public class PageController {
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public List<Page> getAll() {

		Page page1 = new Page();
		page1.setId(1);
		page1.setName("page name 1");
		page1.setFulltext("full text page 1 full text page 1 full text page 1 full text page 1 full text page 1");

		Page page2 = new Page();
		page2.setId(2);
		page2.setName("page name 2");
		page2.setFulltext("full text page 2 full text page 2 full text page 2 full text page 2 full text page 2");

		List<Page> pages = new ArrayList<Page>();
		pages.add(page1);
		pages.add(page2);

		return pages;

	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Page get(@PathVariable Integer id) {

		Page page1 = new Page();
		page1.setId(id);
		page1.setName("get page name" + id);
		page1.setFulltext("full text page 1 full text page 1 full text page 1 full text page 1 full text page 1");

		return page1;
	}

	@RequestMapping(path = "/edit", method = RequestMethod.PUT)
	public Page edit(@RequestBody Page page) {
		page.setName("edit page name");
		return page;
	}

	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public Page add(@RequestBody Page page) {
		page.setName("add page name");
		return page;
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Page> delete(@PathVariable Integer id) {
		return new ResponseEntity<Page>(HttpStatus.OK);
	}
}
