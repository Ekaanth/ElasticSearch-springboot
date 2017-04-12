package com.techprimers.elastic.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "youtube", type = "youtube", shards = 1)
public class Youtube {

	private String kind;
	private String etag;
	private String id;
	private String duration;
	private String caption;
	private String viewcount;
	private String likecount;
	private String dislikecount;
	private String favoriatecount;
	private String commentcount;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getEtag() {
		return etag;
	}
	public void setEtag(String etag) {
		this.etag = etag;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getViewcount() {
		return viewcount;
	}
	public void setViewcount(String viewcount) {
		this.viewcount = viewcount;
	}
	public String getLikecount() {
		return likecount;
	}
	public void setLikecount(String likecount) {
		this.likecount = likecount;
	}
	public String getDislikecount() {
		return dislikecount;
	}
	public void setDislikecount(String dislikecount) {
		this.dislikecount = dislikecount;
	}
	public String getFavoriatecount() {
		return favoriatecount;
	}
	public void setFavoriatecount(String favoriatecount) {
		this.favoriatecount = favoriatecount;
	}
	public String getCommentcount() {
		return commentcount;
	}
	public void setCommentcount(String commentcount) {
		this.commentcount = commentcount;
	}
	public Youtube(String kind, String etag, String id, String duration, String caption, String viewcount,
			String likecount, String dislikecount, String favoriatecount, String commentcount) {
		
		this.kind = kind;
		this.etag = etag;
		this.id = id;
		this.duration = duration;
		this.caption = caption;
		this.viewcount = viewcount;
		this.likecount = likecount;
		this.dislikecount = dislikecount;
		this.favoriatecount = favoriatecount;
		this.commentcount = commentcount;
	}
	@Override
	public String toString() {
		return "Youtube [kind=" + kind + ", etag=" + etag + ", id=" + id + ", duration=" + duration + ", caption="
				+ caption + ", viewcount=" + viewcount + ", likecount=" + likecount + ", dislikecount=" + dislikecount
				+ ", favoriatecount=" + favoriatecount + ", commentcount=" + commentcount + "]";
	}

	public Youtube(){
		
	}
}