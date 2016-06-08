SECTION = "devel/chicken"
DESCRIPTION = "Low-level interface to debugger-protocol"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://debugger-protocol.meta;md5=3eb94d32591eff5d8e92ff901b20b444"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/debugger-protocol/debugger-protocol-${PV}.tar.gz"

SRC_URI[md5sum] = "67206210137bb9d1b3eb0e59dc249d06"
SRC_URI[sha256sum] = "ffa44b46c1219634ac792449a1dd62652750d03d8b3b0664db006718fb8caf05"

S = "${WORKDIR}/debugger-protocol-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
