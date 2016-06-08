SECTION = "devel/chicken"
DESCRIPTION = "A simple Prolog implementation in Scheme, using the AMB operator"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://pll.meta;md5=b60354c9b8ab5eeff470b2a0e9313fe3"
DEPENDS_append_class-cross = " chicken-egg-r7rs-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-r7rs-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-r7rs chicken-egg-r7rs-crosssdk"
DEPENDS = " chicken-egg-r7rs chicken-egg-r7rs-cross"
RDEPENDS_${PN} = " chicken-egg-r7rs"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/pll/pll-${PV}.tar.gz"

SRC_URI[md5sum] = "71db0688dded67e094f660709845cff9"
SRC_URI[sha256sum] = "781142135cad0f69661ca2b863885320d947656d9f7b95950a361b8311e60651"

S = "${WORKDIR}/pll-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
