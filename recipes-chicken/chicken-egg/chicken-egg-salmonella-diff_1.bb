SECTION = "devel/chicken"
DESCRIPTION = "A tool to diff salmonella log files"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://salmonella-diff.meta;md5=b57ed9f533fb7b169e3ec7fa718bd3cc"
DEPENDS_append_class-cross = " chicken-egg-sxml-transforms-cross chicken-egg-regex-cross chicken-egg-salmonella-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-sxml-transforms-crosssdk chicken-egg-regex-crosssdk chicken-egg-salmonella-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-regex nativesdk-chicken-egg-salmonella chicken-egg-sxml-transforms-crosssdk chicken-egg-regex-crosssdk chicken-egg-salmonella-crosssdk"
DEPENDS = " chicken-egg-sxml-transforms chicken-egg-regex chicken-egg-salmonella chicken-egg-sxml-transforms-cross chicken-egg-regex-cross chicken-egg-salmonella-cross"
RDEPENDS_${PN} = " chicken-egg-sxml-transforms chicken-egg-regex chicken-egg-salmonella"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/salmonella-diff/salmonella-diff-${PV}.tar.gz"

SRC_URI[md5sum] = "71ad204903226962470081c1d7e6794e"
SRC_URI[sha256sum] = "3be3863da4b149afa2e401571b1851482a5a17f31683e8586b7d7734573d51d2"

S = "${WORKDIR}/salmonella-diff-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
