SECTION = "devel/chicken"
DESCRIPTION = "Represents unicode with the limited ASCII subset supported by DNS (RFC3492)"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://punycode.meta;md5=eba5c06488c9fed239b49ca505ed6e38"
DEPENDS_append_class-cross = " chicken-egg-miscmacros-cross chicken-egg-utf8-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-miscmacros-crosssdk chicken-egg-utf8-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-utf8 chicken-egg-miscmacros-crosssdk chicken-egg-utf8-crosssdk"
DEPENDS = " chicken-egg-miscmacros chicken-egg-utf8 chicken-egg-miscmacros-cross chicken-egg-utf8-cross"
RDEPENDS_${PN} = " chicken-egg-miscmacros chicken-egg-utf8"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/punycode/punycode-${PV}.tar.gz"

SRC_URI[md5sum] = "88937da07274600c3310fa9bd77890a3"
SRC_URI[sha256sum] = "70078a806ebb6ba9c1317c5e7dba0fee8ab4eb903939e4d40a1608932ba23f6e"

S = "${WORKDIR}/punycode-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
