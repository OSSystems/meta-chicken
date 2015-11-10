SECTION = "devel/chicken"
DESCRIPTION = "URI generic syntax (RFC 3986) parsing and manipulation."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://uri-generic.meta;md5=1250cd4a3012a28332463d6a072263d5"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-defstruct-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-defstruct-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-defstruct chicken-egg-matchable-crosssdk chicken-egg-defstruct-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-defstruct chicken-egg-matchable-cross chicken-egg-defstruct-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-defstruct"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/uri-generic/uri-generic-${PV}.tar.gz"

SRC_URI[md5sum] = "18d9197d85699cdfdd46e147c715043c"
SRC_URI[sha256sum] = "51653da1f19cf4e0e63520e0c56740866b26bed9c411555418fc7a5c3f99ba49"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
