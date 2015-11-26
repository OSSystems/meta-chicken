SECTION = "devel/chicken"
DESCRIPTION = "The SCSH/PLT 'awk' macro"
LICENSE = "LGPL-2.0+"
LIC_FILES_CHKSUM = "file://awk.meta;md5=029d77c099e3cefd0da3db371358d7ea"
DEPENDS_append_class-cross = " chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/awk/awk-${PV}.tar.gz"

SRC_URI[md5sum] = "e707c0a60d47da4e5fcc4494692008bd"
SRC_URI[sha256sum] = "04e284752aa61c9405ca6f2c6a8b0d25f9a7749a65e3ec00d9efd8eb713dfe33"

S = "${WORKDIR}/awk-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
