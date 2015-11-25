SECTION = "devel/chicken"
DESCRIPTION = "srfi-9-ext"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://srfi-9-ext.meta;md5=a6baaec4c008b98562dc5249956ae64d"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper chicken-egg-setup-helper-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-setup-helper-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/srfi-9-ext/srfi-9-ext-${PV}.tar.gz"

SRC_URI[md5sum] = "df5363a70effeac941a9d22f557f3736"
SRC_URI[sha256sum] = "d1091a2231736709fadfe8bed8d476164d6f21900781bf1dfa475e0d7ae00638"

S = "${WORKDIR}/srfi-9-ext-${PV}"

require chicken-egg-srfi-9-ext.inc

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
