SECTION = "devel/chicken"
DESCRIPTION = "A backup/archival system based on content-addressed storage"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ugarit.meta;md5=6c3c1f1ec11065985c18a2f2742c13f4"
DEPENDS_append_class-cross = " chicken-egg-miscmacros-cross chicken-egg-sql-de-lite-cross chicken-egg-crypto-tools-cross chicken-egg-srfi-37-cross chicken-egg-stty-cross chicken-egg-matchable-cross chicken-egg-regex-cross chicken-egg-tiger-hash-cross chicken-egg-message-digest-cross chicken-egg-posix-extras-cross chicken-egg-parley-cross chicken-egg-ssql-cross chicken-egg-pathname-expand-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-miscmacros-crosssdk chicken-egg-sql-de-lite-crosssdk chicken-egg-crypto-tools-crosssdk chicken-egg-srfi-37-crosssdk chicken-egg-stty-crosssdk chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk chicken-egg-tiger-hash-crosssdk chicken-egg-message-digest-crosssdk chicken-egg-posix-extras-crosssdk chicken-egg-parley-crosssdk chicken-egg-ssql-crosssdk chicken-egg-pathname-expand-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-sql-de-lite nativesdk-chicken-egg-crypto-tools nativesdk-chicken-egg-srfi-37 nativesdk-chicken-egg-stty nativesdk-chicken-egg-matchable nativesdk-chicken-egg-regex nativesdk-chicken-egg-tiger-hash nativesdk-chicken-egg-message-digest nativesdk-chicken-egg-posix-extras nativesdk-chicken-egg-parley nativesdk-chicken-egg-ssql nativesdk-chicken-egg-pathname-expand chicken-egg-miscmacros-crosssdk chicken-egg-sql-de-lite-crosssdk chicken-egg-crypto-tools-crosssdk chicken-egg-srfi-37-crosssdk chicken-egg-stty-crosssdk chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk chicken-egg-tiger-hash-crosssdk chicken-egg-message-digest-crosssdk chicken-egg-posix-extras-crosssdk chicken-egg-parley-crosssdk chicken-egg-ssql-crosssdk chicken-egg-pathname-expand-crosssdk"
DEPENDS = " chicken-egg-miscmacros chicken-egg-sql-de-lite chicken-egg-crypto-tools chicken-egg-srfi-37 chicken-egg-stty chicken-egg-matchable chicken-egg-regex chicken-egg-tiger-hash chicken-egg-message-digest chicken-egg-posix-extras chicken-egg-parley chicken-egg-ssql chicken-egg-pathname-expand chicken-egg-miscmacros-cross chicken-egg-sql-de-lite-cross chicken-egg-crypto-tools-cross chicken-egg-srfi-37-cross chicken-egg-stty-cross chicken-egg-matchable-cross chicken-egg-regex-cross chicken-egg-tiger-hash-cross chicken-egg-message-digest-cross chicken-egg-posix-extras-cross chicken-egg-parley-cross chicken-egg-ssql-cross chicken-egg-pathname-expand-cross chicken-egg-ugarit-cross"
RDEPENDS_${PN} = " chicken-egg-miscmacros chicken-egg-sql-de-lite chicken-egg-crypto-tools chicken-egg-srfi-37 chicken-egg-stty chicken-egg-matchable chicken-egg-regex chicken-egg-tiger-hash chicken-egg-message-digest chicken-egg-posix-extras chicken-egg-parley chicken-egg-ssql chicken-egg-pathname-expand"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ugarit/ugarit-${PV}.tar.gz"

SRC_URI[md5sum] = "037f7232dac2ffeea193a04c6eb746d0"
SRC_URI[sha256sum] = "cae0cf0e3a8cd6656bb5bc14c41030e238caf8fda4ff734fa40c905f482d61e2"

S = "${WORKDIR}/ugarit-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
