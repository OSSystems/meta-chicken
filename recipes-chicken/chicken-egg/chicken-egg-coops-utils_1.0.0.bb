SECTION = "devel/chicken"
DESCRIPTION = "coops-utils"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://coops-utils.meta;md5=40bcc0af7e293cd15bcc654938f42697"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-coops-cross chicken-egg-check-errors-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-coops-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-coops nativesdk-chicken-egg-check-errors chicken-egg-setup-helper-crosssdk chicken-egg-coops-crosssdk chicken-egg-check-errors-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-coops chicken-egg-check-errors chicken-egg-setup-helper-cross chicken-egg-coops-cross chicken-egg-check-errors-cross chicken-egg-coops-utils-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-coops chicken-egg-check-errors"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/coops-utils/coops-utils-${PV}.tar.gz"

SRC_URI[md5sum] = "606642e1efbb8bfefc5e2df41c3a40f7"
SRC_URI[sha256sum] = "53b3c3a2db2a5adb0f502b5e0dba06dfbee1ba712f03abdaf740853c2f06ffef"

S = "${WORKDIR}/coops-utils-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
