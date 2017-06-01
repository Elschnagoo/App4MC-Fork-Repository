package org.eclipse.app4mc.multicore.openmapping.model;

import org.eclipse.app4mc.amalthea.model.Tag;

public class OMTag extends OMAnnotationElement {
	private Tag refTag;

	public OMTag(final Tag t) {
		this.refTag = t;
	}

	public boolean isEqual(final Tag cmpTag) {
		String t1_name = refTag.getName();
		String t1_type = refTag.getTagType();
		String t2_name = cmpTag.getName();
		String t2_type = cmpTag.getTagType();
		return (t1_name == t2_name && t1_type == t2_type);
	}

	@Override
	public boolean equals(Object obj) {
		boolean eqName;
		boolean eqType;
		if (obj instanceof OMTag) {
			OMTag ot = (OMTag) obj;
			if (ot.refTag == null)
				return false;

			String t1_name = this.refTag.getName();
			String t2_name = ot.refTag.getName();
			if (t1_name == null || t2_name == null) {
				if (t1_name == null && t2_name == null) {
					eqName = true;
				} else {
					eqName = false;
				}
			} else {
				eqName = (t1_name.equals(t2_name));
			}

			String t1_type = this.refTag.getTagType();
			String t2_type = ot.refTag.getTagType();
			if (t1_type == null || t2_type == null) {
				if (t1_type == null && t2_type == null) {
					eqType = true;
				} else {
					eqType = false;
				}
			}else {
				eqType = (t1_type.equals(t2_type));
			}

			return (eqName && eqType);
		}
		return false;
	}

	@Override
	public int hashCode() {
		int i = 1;
		i = i * 31 + this.refTag.getName().hashCode();
		i = i * 17 + (this.refTag.getTagType() == null ? 0 : this.refTag.getTagType().hashCode());
		return i;
	}

	@Override
	public String toString() {
		return this.refTag.getName() + ":" + this.refTag.getTagType() + ":" + this.refTag.getUniqueName();
	}

}
