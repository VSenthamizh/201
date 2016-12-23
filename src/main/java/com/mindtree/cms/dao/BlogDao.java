/**
 * 
 */
package com.mindtree.cms.dao;

import java.util.List;

import com.mindtree.cms.model.BlogComments;
import com.mindtree.cms.model.BlogContent;

/**
 * @author M1022115
 *
 */
public interface BlogDao {

	void save(BlogContent blogContent);

	List<BlogContent> findAll();

	public List<BlogComments> findAllBlogComments(int blogId);

	void saveBlogComments(BlogComments blogComments) throws Exception;

	public BlogContent findAllBlogContent(int blogId);
}
