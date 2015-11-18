SECTION = "devel/chicken"
DESCRIPTION = "An aggressively optimizing Scheme->C compiler"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://stalin.meta;md5=bdc12b9e7e048f3886f763e1ee97ff5a"
DEPENDS_append_class-cross = " chicken-egg-make-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-make-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-make chicken-egg-make-crosssdk"
DEPENDS = " chicken-egg-make chicken-egg-make-cross"
RDEPENDS_${PN} = " chicken-egg-make"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/stalin/stalin-${PV}.tar.gz"

SRC_URI[md5sum] = "ad2d3e4fa03401e04a1630c0ac92188b"
SRC_URI[sha256sum] = "8e187cf4ca5ed0c389bdcbfb45fb67f82aec13124994c1c9ae8fbe26a041bca7"

S = "${WORKDIR}/stalin-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
