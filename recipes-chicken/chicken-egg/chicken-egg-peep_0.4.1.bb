SECTION = "devel/chicken"
DESCRIPTION = "Explore the compiler's symbol database"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://peep.meta;md5=53ec573b2f94093c46bcc6851a929b9f"
DEPENDS_append_class-cross = " chicken-egg-dissector-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-dissector-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-dissector chicken-egg-dissector-crosssdk"
DEPENDS = " chicken-egg-dissector chicken-egg-dissector-cross"
RDEPENDS_${PN} = " chicken-egg-dissector"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/peep/peep-${PV}.tar.gz"

SRC_URI[md5sum] = "27e71e6b38e1f7ee57741f35ade3d5a5"
SRC_URI[sha256sum] = "71c0c0de6abf87d8a72901feb9ab471607cc0211393446628a24dad5e90cb703"

S = "${WORKDIR}/peep-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
