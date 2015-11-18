SECTION = "devel/chicken"
DESCRIPTION = "A simple interface to Java(tm)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://javahack.meta;md5=8b672b8c7d4b33fef247308e4cf87907"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/javahack/javahack-${PV}.tar.gz"

SRC_URI[md5sum] = "552d989768aa0f939c625674316cf463"
SRC_URI[sha256sum] = "bcc190de41af8a2733a7e5ac333f13557f45baf726d2b11d601197f94e1c9603"

S = "${WORKDIR}/javahack-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
