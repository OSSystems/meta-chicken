SECTION = "devel/chicken"
DESCRIPTION = "The SCSH/PLT 'awk' macro"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://awk.meta;md5=4e9e958f9791c7a1f7078ad5a0149a12"
DEPENDS_append_class-cross = " chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/awk/awk-${PV}.tar.gz"

SRC_URI[md5sum] = "07ee315f5420721b64929bb158a1b994"
SRC_URI[sha256sum] = "d920ba86984419278435dfe3885271e2d4b9100153075df52d73f2c51570f446"

S = "${WORKDIR}/awk-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
