SECTION = "devel/chicken"
DESCRIPTION = "A restricted statically typed subset of Scheme"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://crunch.meta;md5=33809b3139208b2a207b51a4a25ccd07"
DEPENDS_append_class-cross = " chicken-egg-miscmacros-cross chicken-egg-defstruct-cross chicken-egg-matchable-cross chicken-egg-make-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-miscmacros-crosssdk chicken-egg-defstruct-crosssdk chicken-egg-matchable-crosssdk chicken-egg-make-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-defstruct nativesdk-chicken-egg-matchable nativesdk-chicken-egg-make chicken-egg-miscmacros-crosssdk chicken-egg-defstruct-crosssdk chicken-egg-matchable-crosssdk chicken-egg-make-crosssdk"
DEPENDS = " chicken-egg-miscmacros chicken-egg-defstruct chicken-egg-matchable chicken-egg-make chicken-egg-miscmacros-cross chicken-egg-defstruct-cross chicken-egg-matchable-cross chicken-egg-make-cross chicken-egg-crunch-cross"
RDEPENDS_${PN} = " chicken-egg-miscmacros chicken-egg-defstruct chicken-egg-matchable chicken-egg-make"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/crunch/crunch-${PV}.tar.gz"

SRC_URI[md5sum] = "3d0631ad52b0e66661e847eea906cd73"
SRC_URI[sha256sum] = "4f6849871c1e934555c3e7fc2032ab4e558cd2e8ba4e6b993b6804f5e1ff2054"

S = "${WORKDIR}/crunch-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
