SECTION = "devel/chicken"
DESCRIPTION = "Enable SSQL mode for awful's database-support eggs"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://awful-ssql.meta;md5=e5df6c0237214c2d4b6e087107aded50"
DEPENDS_append_class-cross = " chicken-egg-ssql-cross chicken-egg-awful-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-ssql-crosssdk chicken-egg-awful-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-ssql nativesdk-chicken-egg-awful chicken-egg-ssql-crosssdk chicken-egg-awful-crosssdk"
DEPENDS = " chicken-egg-ssql chicken-egg-awful chicken-egg-ssql-cross chicken-egg-awful-cross"
RDEPENDS_${PN} = " chicken-egg-ssql chicken-egg-awful"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/awful-ssql/awful-ssql-${PV}.tar.gz"

SRC_URI[md5sum] = "835445520431d8c825945dbc5d13750f"
SRC_URI[sha256sum] = "3c8ee89a76de9b106cd98a330adf35731469426f33d2753e5db47efd2df72cfa"

S = "${WORKDIR}/awful-ssql-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
