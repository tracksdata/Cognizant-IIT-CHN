package com.hcl.cf.webstore.domain.entities;

import java.util.HashSet;
import java.util.Set;

import com.hcl.cf.webstore.domain.interfaces.IImage;
import com.hcl.cf.webstore.domain.interfaces.IImages;

public class Images implements IImages {

	private Set<Image> images = new HashSet<Image>();

	public void addImage(IImage image) {

		// ! Done to avoid multiple objects from sharing the same instance...
		Image img = new Image();
		img.setName(image.getName());
		img.setPath(image.getPath());
		this.images.add(img);
	}

	public void removeImage(IImage image) {
		this.images.remove(images);
	}

	public boolean hasImages() {
		return (this.images.size() > 0) ? true : false;
	}

	/**
	 * @return the images
	 */
	public Set<IImage> getIImages() {
		return new HashSet<IImage> (images);
	}

	/**
	 * @param images
	 *            the images to set
	 */
	public void setImages(Set<Image> images) {
		this.images = images;
	}

	/**
	 * @return the images
	 */
	public Set<Image> getImages() {
		return images;
	}	
}
