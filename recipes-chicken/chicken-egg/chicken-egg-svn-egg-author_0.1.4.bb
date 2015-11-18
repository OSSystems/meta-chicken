SECTION = "devel/chicken"
DESCRIPTION = "A small egg to make life easier for svn-using authors of Chicken eggs"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://svn-egg-author.meta;md5=b63706a18a3989a2ae78e16dbad51ac1"
DEPENDS_append_class-cross = " chicken-egg-ssax-cross chicken-egg-sxpath-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-ssax-crosssdk chicken-egg-sxpath-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-ssax nativesdk-chicken-egg-sxpath chicken-egg-ssax-crosssdk chicken-egg-sxpath-crosssdk"
DEPENDS = " chicken-egg-ssax chicken-egg-sxpath chicken-egg-ssax-cross chicken-egg-sxpath-cross"
RDEPENDS_${PN} = " chicken-egg-ssax chicken-egg-sxpath"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/svn-egg-author/svn-egg-author-${PV}.tar.gz"

SRC_URI[md5sum] = "61cdd7716ff1faa55dc89d6f17f170e5"
SRC_URI[sha256sum] = "35f214b80a8fa3885a54e6af1ea3fc89f2368a1fc7984b9e3ed32ae2db1eb11b"

S = "${WORKDIR}/svn-egg-author-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
