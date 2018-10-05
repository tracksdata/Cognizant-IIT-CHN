package com.hcl.cf.webstore.domain.interfaces;

import java.util.Set;

public interface IImages {

	void addImage(IImage image);

	void removeImage(IImage image);

	boolean hasImages();

	/**
	 * @return the images
	 */
	Set<IImage> getIImages();
}
