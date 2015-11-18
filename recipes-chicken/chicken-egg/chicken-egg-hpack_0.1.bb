SECTION = "devel/chicken"
DESCRIPTION = "A HTTP/2 header compression library for Chicken"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://hpack.meta;md5=30baa42177cd2f5cdb4f748833da577c"
DEPENDS_append_class-cross = " chicken-egg-defstruct-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-defstruct-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-defstruct chicken-egg-defstruct-crosssdk"
DEPENDS = " chicken-egg-defstruct chicken-egg-defstruct-cross"
RDEPENDS_${PN} = " chicken-egg-defstruct"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/hpack/hpack-${PV}.tar.gz"

SRC_URI[md5sum] = "9275cbaa000ca10fa117fcaa10c18ff5"
SRC_URI[sha256sum] = "bf7ac4b0a20d7eddd0dcf87b8636b6592bade72dbb4353c8ede2c6afdc6b2d11"

S = "${WORKDIR}/hpack-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
