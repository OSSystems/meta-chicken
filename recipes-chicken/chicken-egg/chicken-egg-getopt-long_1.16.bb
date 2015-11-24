SECTION = "devel/chicken"
DESCRIPTION = "Command line option parsing."
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://getopt-long.meta;md5=363f7d6ad5fa3cb9d123b0b427e8d593"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable chicken-egg-matchable-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-matchable-cross"
RDEPENDS_${PN} = " chicken-egg-matchable"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/getopt-long/getopt-long-${PV}.tar.gz"

SRC_URI[md5sum] = "4de32a31019aff90e2ff75fbefe50903"
SRC_URI[sha256sum] = "6d4cfc43b828a45c4fe97b967fb36ed0c09a32aa82abc159e4420fff9116321d"

S = "${WORKDIR}/getopt-long-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
