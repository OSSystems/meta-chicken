SECTION = "devel/chicken"
DESCRIPTION = "LLRB tree general and customized to key types."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://llrb-tree.meta;md5=bfb16c229db8d6a47180aa8444eb65d0"
DEPENDS_append_class-cross = " chicken-egg-llrb-syntax-cross chicken-egg-comparators-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-llrb-syntax-crosssdk chicken-egg-comparators-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-llrb-syntax nativesdk-chicken-egg-comparators chicken-egg-llrb-syntax-crosssdk chicken-egg-comparators-crosssdk"
DEPENDS = " chicken-egg-llrb-syntax chicken-egg-comparators chicken-egg-llrb-syntax-cross chicken-egg-comparators-cross"
RDEPENDS_${PN} = " chicken-egg-llrb-syntax chicken-egg-comparators"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/llrb-tree/llrb-tree-${PV}.tar.gz"

SRC_URI[md5sum] = "32d6967f4a37afc895d153a7064e3f89"
SRC_URI[sha256sum] = "23900cd2f1c65f95f7e08f93ca57af746629bf4b68207d4545b74913bc8a740f"

S = "${WORKDIR}/llrb-tree-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
