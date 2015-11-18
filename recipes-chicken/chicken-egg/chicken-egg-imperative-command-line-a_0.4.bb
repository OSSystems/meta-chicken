SECTION = "devel/chicken"
DESCRIPTION = "A simple, imperative-style command-line parser"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://imperative-command-line-a.meta;md5=b87099c25f1bdf72393d91ffab3190f5"
DEPENDS_append_class-cross = " chicken-egg-miscmacros-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-miscmacros-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-miscmacros chicken-egg-miscmacros-crosssdk"
DEPENDS = " chicken-egg-miscmacros chicken-egg-miscmacros-cross"
RDEPENDS_${PN} = " chicken-egg-miscmacros"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/imperative-command-line-a/imperative-command-line-a-${PV}.tar.gz"

SRC_URI[md5sum] = "d1b1bc117972a255681c7d4d6b1a113d"
SRC_URI[sha256sum] = "6eba3ac75c3ae9864ae05713a3687fcf44c5fc16d2de466f3a2a16ab120f7435"

S = "${WORKDIR}/imperative-command-line-a-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
