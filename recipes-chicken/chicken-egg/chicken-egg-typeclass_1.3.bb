SECTION = "devel/chicken"
DESCRIPTION = "Type classes"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://typeclass.meta;md5=a6d9ef52d6a62a3c7d6b8565ad94b5cb"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/typeclass/typeclass-${PV}.tar.gz"

SRC_URI[md5sum] = "b09417e44738149e989f37c338898e70"
SRC_URI[sha256sum] = "8c3951bad2b37b20e56c94cdfc645004f5447a0ad1df7cdc1de43a558e6ae88a"

S = "${WORKDIR}/typeclass-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
