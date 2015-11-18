SECTION = "devel/chicken"
DESCRIPTION = "A functional interface to Oleg Kiselyov's and Ivan Raikov's treap egg"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://treaps.meta;md5=dc184fff775e9aef96ee96476f79dfda"
DEPENDS_append_class-cross = " chicken-egg-treap-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-treap-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-treap chicken-egg-treap-crosssdk"
DEPENDS = " chicken-egg-treap chicken-egg-treap-cross"
RDEPENDS_${PN} = " chicken-egg-treap"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/treaps/treaps-${PV}.tar.gz"

SRC_URI[md5sum] = "ca2fd047f971f59cd5fe77bf4ef291a3"
SRC_URI[sha256sum] = "97a8f563efad50c213e1e366c7be6ef48b4454e9553317a52c46395dd7714165"

S = "${WORKDIR}/treaps-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
