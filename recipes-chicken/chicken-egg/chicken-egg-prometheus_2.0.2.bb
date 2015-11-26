SECTION = "devel/chicken"
DESCRIPTION = "The Prometheus prototype-based object system"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://prometheus.meta;md5=f5ea5852a604703b64454a6f9bece35d"
DEPENDS_append_class-cross = " chicken-egg-s48-modules-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-s48-modules-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-s48-modules chicken-egg-s48-modules-crosssdk"
DEPENDS = " chicken-egg-s48-modules chicken-egg-s48-modules-cross chicken-egg-prometheus-cross"
RDEPENDS_${PN} = " chicken-egg-s48-modules"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/prometheus/prometheus-${PV}.tar.gz"

SRC_URI[md5sum] = "da270f2749778baa55f3a81677f607fd"
SRC_URI[sha256sum] = "7045386ceed406b77211b5a89a916c72aae27caa32b7d048c2bb1e7bf08d2792"

S = "${WORKDIR}/prometheus-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
